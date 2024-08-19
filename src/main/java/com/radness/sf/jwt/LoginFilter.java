package com.radness.sf.jwt;

import com.radness.sf.account.CustomAccountDetails;
import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.Collection;
import java.util.Iterator;

@RequiredArgsConstructor
public class LoginFilter extends UsernamePasswordAuthenticationFilter {

    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    @Override
    public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res) {
        // 클라이언트 요청에서 받아온다.
        String username = obtainUsername(req);
        String password = obtainPassword(req);

//        logger.info("username: " + username + " and password: " + password);

        // 스프링 시큐리티에서 token 에 값을 담아서 검증
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, password, null);

        // token 을 검증하기 위한 AuthenticationManager
        return authenticationManager.authenticate(authenticationToken);
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest req, HttpServletResponse res, FilterChain filterChain, Authentication authentication) {
//        logger.info("success");

        // type case
        CustomAccountDetails customAccountDetails = (CustomAccountDetails) authentication.getPrincipal();
        String nickname = customAccountDetails.getNickname();

        // role 가져오기
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        Iterator<? extends GrantedAuthority> iterator = authorities.iterator();
        GrantedAuthority auth = iterator.next();
        String role = auth.getAuthority();

        String token = jwtUtil.createJwt(nickname, role, 60*60*10L);

        // HTTP 인증 방식 : RFC 7235 정의에 따라 아래 인증 헤더 형태를 가져야한다.
        // Authorization : 타입 인증토큰
        // ex) Authorization: Bearer 인증토큰(string)
        res.addHeader("Authorization", "Bearer " + token);
    }

    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest req, HttpServletResponse res, AuthenticationException failed) {
//        logger.info("fail");
        res.setStatus(401);
    }
}


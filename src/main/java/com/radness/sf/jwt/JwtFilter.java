package com.radness.sf.jwt;

import com.radness.sf.account.Account;
import com.radness.sf.account.CustomAccountDetails;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@RequiredArgsConstructor
public class JwtFilter extends OncePerRequestFilter {

    private final JwtUtil jwtUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // request에서 Authorization 헤더를 찾는다
        String authorization = request.getHeader("Authorization");

        // Authorization 헤더 검증
        if (authorization == null || !authorization.startsWith("Bearer ")) {
//            logger.info("token is null");
            filterChain.doFilter(request, response);

            // 조건이 해당되면 메서드 종료(필수)
            return;
        }

        String token = authorization.split(" ")[1];

        // 토큰 소멸 시간 검증
        if (jwtUtil.isExpired(token)) {
//            logger.info("token is expired");
            filterChain.doFilter(request, response);

            // 조건이 해당되면 메서드 종료(필수)
            return;
        }

        Account account = Account.builder()
                .nickname(jwtUtil.getNickname(token))
                .password("asd123")
                .role(jwtUtil.getRole(token))
                .build();

        CustomAccountDetails customAccountDetails = new CustomAccountDetails(account);
        // 스프링 시큐리티 인증 토큰 생성
        Authentication authToken = new UsernamePasswordAuthenticationToken(customAccountDetails, null, customAccountDetails.getAuthorities());
        // 세션에 사용자 등록
        SecurityContextHolder.getContext().setAuthentication(authToken);
        filterChain.doFilter(request, response);

    }
}

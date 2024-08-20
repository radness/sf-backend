package com.radness.sf.login;

import com.radness.sf.account.Account;
import com.radness.sf.account.AccountService;
import com.radness.sf.exception.BizException;
import com.radness.sf.jwt.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginController {

    private final AccountService accountService;
    private final JwtUtil jwtUtil;

    @GetMapping(value = {"", "/"})
    public String home() {
        return "home";
    }

    @PostMapping("/login")
    public String login(@RequestBody Account input) throws BizException {
        Account account = accountService.login(input);
        if (account == null) {
            throw new BizException("id");
        }

        return jwtUtil.createJwt(account.getNickname(), account.getRole(), 60 * 60 * 10L);
    }
}

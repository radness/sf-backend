package com.radness.sf.account;

import com.radness.sf.exception.BizException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;
    private final AccountRepository accountRepository;

    @PostMapping("/join")
    public String join(AccountDto account) {
        accountService.join(account);
        return "success";
    }

    @GetMapping("/email-login")
    public String loginByEmail(String token, String email) throws BizException {
        Account account = accountRepository.findByEmail(email);
        if (account == null || account.isValidToken(token)) {
            throw new BizException("로그인할 수 없습니다.");
        }
        accountService.login(account);
        return "success";
    }
}

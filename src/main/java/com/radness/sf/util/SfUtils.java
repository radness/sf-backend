package com.radness.sf.util;

import com.radness.sf.account.Account;
import com.radness.sf.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.security.auth.login.AccountNotFoundException;
import java.util.Optional;

@Component
public class SfUtils {

    private static AccountRepository accountRepository;

    @Autowired
    public void setAccountRepository(AccountRepository accountRepository) {
        SfUtils.accountRepository = accountRepository;
    }

    public static String getFactoryCode() throws AccountNotFoundException {
        Optional<Account> account = getAccount();
        return account.get().getFactoryCode();
    }

    private static Optional<Account> getAccount() throws AccountNotFoundException {
        Optional<Account> account = ThreadUtils.getAccount("AuthUtils.authInfoStr");
        return Optional.ofNullable(accountRepository.findById("str1").orElseThrow(AccountNotFoundException::new));
    }
}

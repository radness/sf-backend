package com.radness.sf.account;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService implements UserDetailsService {

    private final AccountRepository accountRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String emailOrNickname) throws UsernameNotFoundException {
        Account account = accountRepository.findByEmail(emailOrNickname);
        if (account == null) {
            account = accountRepository.findByNickname(emailOrNickname);
        }
        if (account == null) {
            throw new UsernameNotFoundException(emailOrNickname);
        }

        return new CustomAccountDetails(account);

        // 해당되는 사용자가 존재하는 경우
//        return new UserAccount(account);
    }

    public void login(Account account) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
          // Principal 객체
          new UserAccount(account),
          account.getPassword(),
          List.of(new SimpleGrantedAuthority("ROLE_USER")));

        SecurityContextHolder.getContext().setAuthentication(token);
    }

    public void join(AccountDto account) {
        if (accountRepository.existsByNickname(account.getNickname())) {
            return;
        }

        Account newAccount = new Account();
        newAccount.setNickname(account.getNickname());
        newAccount.setEmail(account.getEmail());
        newAccount.setPassword(bCryptPasswordEncoder.encode(account.getPassword()));
        newAccount.setRole("ROLE_ADMIN");

        accountRepository.save(newAccount);
    }
}

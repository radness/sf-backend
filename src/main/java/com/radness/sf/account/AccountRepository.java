package com.radness.sf.account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {

    Account findByEmail(String email);

    Account findByNickname(String emailOrNickname);

    Boolean existsByNickname(String nickname);
}

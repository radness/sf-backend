package com.radness.sf.account;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {

    @Id
    @GeneratedValue
    private String id;

    @Getter
    private String factoryCode;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String nickname;

    private String password;

    private boolean emailVerified; // 인증된 계정인지

    private String emailCheckToken; // 토큰값

    private LocalDateTime joinedAt;

    private String bio;

    private String url;

    private String occupation;

    private String location; // 거주 지역

    @Lob
    @Basic(fetch = FetchType.EAGER)
    private String profileImage;

    public boolean isValidToken(String token) {
        return this.emailCheckToken.equals(token);
    }

}

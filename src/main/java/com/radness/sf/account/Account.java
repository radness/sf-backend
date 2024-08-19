package com.radness.sf.account;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ColumnDefault("1000")
    private String factoryId;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String nickname;

    private String password;

    private String role;

    private boolean emailVerified; // 인증된 계정인지

    private String emailCheckToken; // 토큰값

    @Temporal(TemporalType.TIMESTAMP)
    private Date joinedAt;

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

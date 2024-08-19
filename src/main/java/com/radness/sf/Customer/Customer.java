package com.radness.sf.Customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(CustomerPK.class)
@Table(name = "customers")
public class Customer {

    @Id
    private String factoryId;

    @Id
    private String customerId;

    private String customerDescription;

    private String address;

    private String email;

    private String phoneNumber;

    private String faxNumber;

    private String ceo;
}

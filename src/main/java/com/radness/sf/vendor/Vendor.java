package com.radness.sf.vendor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "vendors")
public class Vendor {

    @Id
    private String vendorId;

    private String vendorDescription;

    private String address;

    private String city;

    private String region;

    private String country;

    private String phone;

}

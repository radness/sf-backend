package com.radness.sf.Customer;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerPK implements Serializable {

    @Value("${sf.entry.factoryId}")
    @Column(name = "factory_id")
    private String factoryId;

    @Column(name = "customer_id")
    private String customerId;
}

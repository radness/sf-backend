package com.radness.sf.wip.lot.history;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class WipLotHistoryId implements Serializable {

    @Column(name = "factory_id")
    private String factoryId;

    @Column(name = "lot_id")
    private String lotId;

    @Column(name = "seq")
    private int seq;
}

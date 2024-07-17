package com.radness.sf.wip.history;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WipLotHistoryId implements Serializable {

    @Column(name = "factory_id")
    private String factoryId;

    @Column(name = "lot_id")
    private String lotId;

    @Column(name = "seq")
    private int seq;
}

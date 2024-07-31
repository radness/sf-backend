package com.radness.sf.wip.lot.history;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface WipLotHistoryRepository extends JpaRepository<WipLotHistory, Long> {

    Optional<WipLotHistory> findById(WipLotHistoryId historyId);

    @Query("select w from WipLotHistory w where w.id.factoryId = :factoryId and w.id.lotId = :lotId order by w.id.seq desc")
    Optional<WipLotHistory> findLastWipLotHistory(@Param("factoryId") String factoryId, @Param("lotId") String lotId);
}

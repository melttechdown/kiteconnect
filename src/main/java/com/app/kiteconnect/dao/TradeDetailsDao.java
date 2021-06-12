package com.app.kiteconnect.dao;

import com.app.kiteconnect.model.TradeDetails;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface TradeDetailsDao extends CrudRepository<TradeDetails, Long> {
    TradeDetails findByName(String name);

    @Query("SELECT b FROM TradeDetails b WHERE b.name IN (:names)")
    List<TradeDetails> findByTradeDetailsNames(@Param("names")List<String> names);
}

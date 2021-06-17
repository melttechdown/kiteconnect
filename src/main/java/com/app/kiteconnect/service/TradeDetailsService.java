package com.app.kiteconnect.service;


import com.app.kiteconnect.model.TradeDetails;

import java.util.List;

public interface TradeDetailsService {

	TradeDetails findById(long id);

	List<TradeDetails> findAll();

	TradeDetails save(TradeDetails book);

	void delete(long id);

	TradeDetails update(TradeDetails tradeDetails);
}

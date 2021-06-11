package com.app.kiteconnect.service.impl;

import com.app.kiteconnect.model.TradeDetails;
import com.app.kiteconnect.service.TradeDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "tradeDetailsService")
@RequiredArgsConstructor
public class TradeDetailsServiceImpl implements TradeDetailsService {
	@Override
	public TradeDetails findById(long id) {
		return null;
	}

	@Override
	public List<TradeDetails> findAll() {
		return null;
	}

	@Override
	public TradeDetails save(TradeDetails book) {
		return null;
	}

	@Override
	public void delete(long id) {

	}

	@Override
	public TradeDetails update(TradeDetails tradeDetails) {
		return null;
	}
}

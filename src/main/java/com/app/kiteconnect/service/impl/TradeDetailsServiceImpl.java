package com.app.kiteconnect.service.impl;

import com.app.kiteconnect.dao.TradeDetailsDao;
import com.app.kiteconnect.exception.NoDataFoundException;
import com.app.kiteconnect.model.TradeDetails;
import com.app.kiteconnect.service.TradeDetailsService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service(value = "tradeDetailsService")
@RequiredArgsConstructor
public class TradeDetailsServiceImpl implements TradeDetailsService {

	@Autowired
	TradeDetailsDao tradeDetailsDao;

	@Override
	public TradeDetails findById(long id) {
		Optional<TradeDetails> optionalTrade = tradeDetailsDao.findById(id);
		return optionalTrade.isPresent() ? optionalTrade.get() : null;
	}

	@Override
	public List<TradeDetails> findAll() {
		List<TradeDetails> list = new ArrayList<>();
		tradeDetailsDao.findAll().iterator().forEachRemaining(list::add);
		if (list.isEmpty()) {
			throw new NoDataFoundException();
		}
		return list;
	}

	@Override
	public TradeDetails save(TradeDetails tradeDetails) {
		return Optional.of(!StringUtils.isEmpty(tradeDetails.getName()))
				.filter(Boolean::booleanValue)
				.map(correctRequest ->
						Optional.ofNullable(null == tradeDetailsDao.findByName(tradeDetails.getName()))
								.filter(Boolean::booleanValue)
								.map(notPresentTradeDetails -> tradeDetailsDao.save(TradeDetails.builder()
										.name(tradeDetails.getName())
										.description(tradeDetails.getDescription())
										.amount(tradeDetails.getAmount())
										.price(tradeDetails.getPrice())
										.soldoutMin(tradeDetails.getSoldoutMin())
										.thresholdMax(tradeDetails.getThresholdMax())
										.build()))
								.orElseThrow(() -> new NoDataFoundException())
				).orElseThrow(() -> new NoDataFoundException());
	}

	@Override
	public void delete(long id) {
		tradeDetailsDao.deleteById(id);
	}

	@Override
	public TradeDetails update(TradeDetails tradeDetails) {
		TradeDetails tradeDetails1 = findById(tradeDetails.getId());
		if (tradeDetails1 != null) {
			tradeDetailsDao.save(tradeDetails);
		}
		return tradeDetails1;
	}
}

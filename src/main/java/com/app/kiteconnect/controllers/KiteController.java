package com.app.kiteconnect.controllers;

import com.app.kiteconnect.model.TradeDetails;
import com.app.kiteconnect.service.TradeDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class KiteController {
    @Autowired
    private final TradeDetailsService tradeDetailsService;

    @RequestMapping(value = "/api/v1/tradedetails/all", method = RequestMethod.GET)
    public @ResponseBody
    List<TradeDetails> tradeDetailListRest() {
        return (List<TradeDetails>) tradeDetailsService.findAll();
    }

    @RequestMapping(value = "/api/v1/tradedetails/{id}", method = RequestMethod.GET)
    public @ResponseBody
    TradeDetails findTradeDetailRest(@PathVariable("id") long tradeId) {
        return tradeDetailsService.findById(tradeId);
    }


    @RequestMapping(value = "/api/v1/tradedetails/save", method = RequestMethod.POST)
    public ResponseEntity<TradeDetails> addTradeDetailsk(@RequestBody TradeDetails tradeDetails) {
        return new ResponseEntity<TradeDetails>(tradeDetailsService.save(tradeDetails), HttpStatus.OK);
    }


}

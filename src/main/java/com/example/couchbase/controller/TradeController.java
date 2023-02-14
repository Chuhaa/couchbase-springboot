package com.example.couchbase.controller;

import com.example.couchbase.model.payloads.Trade;
import com.example.couchbase.model.trade.TradeType;
import com.example.couchbase.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trade")
public class TradeController {

    @Autowired
    private TradeService tradeService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody TradeType tradeType) {
        tradeService.saveTrade(tradeType);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public void get(@RequestParam(name = "totalRecords") int totalRecords, @RequestParam(name = "size") int size) {
        tradeService.getTrades(totalRecords, size);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void delete() {
        tradeService.deleteAll();
    }
}

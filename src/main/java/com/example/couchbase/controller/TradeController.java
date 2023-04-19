package com.example.couchbase.controller;

import com.example.couchbase.model.payloads.Trade;
import com.example.couchbase.model.trade.TradeType;
import com.example.couchbase.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Trade get(@PathVariable String id) {
        return tradeService.getTrade(id);
    }

//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public Page<TradeInfo> getAllByPage(@RequestParam(name = "page") int page, @RequestParam(name = "size") int size) {
//        return tradeService.getAllTradesPage(page, size);
//    }

    @GetMapping(path = "/search-at/depth1/{externalRefNumber}")
    @ResponseStatus(HttpStatus.OK)
    public List<Trade> getTradeByExternalRefNumber(@PathVariable int refNumber) {
        return tradeService.getTradesByExternalRefNumber(refNumber);
    }


//    @GetMapping(path = "/search-at/depth2/{contractId}")
//    @ResponseStatus(HttpStatus.OK)
//    public List<Trade> getTradeByContractId(@PathVariable int contractId) {
//        return tradeService.getTradesByContractId(contractId);
//    }
//
//    @GetMapping(path = "/search-at/depth4/{globalKey}")
//    @ResponseStatus(HttpStatus.OK)
//    public List<Trade> getTradeByGlobalKey(String globalKey) {
//        return tradeService.getTradesByGlobalKey(globalKey);
//    }

//
//    @PatchMapping
//    @ResponseStatus(HttpStatus.OK)
//    public void updateTrade(@PathVariable String id, @RequestBody Trade trade) {
//        tradeService.updateTrade(id, trade);
//    }


    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void delete() {
        tradeService.deleteAll();
    }
}

package com.example.couchbase.controller;

import com.example.couchbase.model.Trade;
import com.example.couchbase.model.TradeInfo;
import com.example.couchbase.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public void save(@RequestBody TradeInfo trade) {
        tradeService.saveTrade(trade);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TradeInfo get(@PathVariable String id) {
        return tradeService.getTrade(id);
    }

//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public Page<TradeInfo> getAllByPage(@RequestParam(name = "page") int page, @RequestParam(name = "size") int size) {
//        return tradeService.getAllTradesPage(page, size);
//    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<TradeInfo> getTradeByGlobalKey(@RequestParam(name = "globalKey", required = false) String globalKey,
                                               @RequestParam(name = "tradeGlobalKey", required = false) String tradeGlobalKey) {

        if (globalKey != null) {
            return tradeService.getByMetaGlobalKey(globalKey);
        }
        if (tradeGlobalKey != null) {
            return tradeService.getByTradeMetaGlobalKey(tradeGlobalKey);
        }
        return tradeService.getAllTrades();
    }

//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public List<TradeInfo> getTradeByTradeGlobalKey(@RequestParam(name = "tradeGlobalKey") String key) {
//        return tradeService.getByTradeMetaGlobalKey(key);
//    }

    @PatchMapping
    @ResponseStatus(HttpStatus.OK)
    public void updateTrade(@PathVariable String id, @RequestBody Trade trade) {
        tradeService.updateTrade(id, trade);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable String id) {
        tradeService.deleteTrade(id);
    }
}

package com.example.couchbase.service;


import com.example.couchbase.model.Trade;
import com.example.couchbase.model.TradeInfo;
import com.example.couchbase.repo.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TradeService {

    @Autowired
    TradeRepository tradeRepository;
    public void saveTrade(TradeInfo trade) {
        tradeRepository.save(trade);
    }

    public TradeInfo getTrade(String id) {
        Optional<TradeInfo> trade = tradeRepository.findById(id);
        if (trade.isPresent()) {
            return trade.get();
        } else {
            throw new RuntimeException("ID not found");
        }
    }

    public Iterable<TradeInfo> getAllTrades() {
        return tradeRepository.findAll();
    }

    public Page<TradeInfo> getAllTradesPage(int page, int size) {
        return tradeRepository.findAll(PageRequest.of(page, size));
    }

    public List<TradeInfo> getByMetaGlobalKey(String id) {
        System.out.println(id);
        return tradeRepository.findByMetaGlobalKey(id);
    }
    public List<TradeInfo> getByTradeMetaGlobalKey(String id) {
        System.out.println(id);
        return tradeRepository.findByTradeMetaGlobalKey(id);
    }

    public void updateTrade(String id, Trade trade) {
        Optional<TradeInfo> existingTrade = tradeRepository.findById(id);
        if (existingTrade.isPresent()) {
            TradeInfo tr = existingTrade.get();
            tr.setTrade(trade);
            tradeRepository.save(tr);
        }
    }

    public void deleteTrade(String id) {
        tradeRepository.deleteById(id);
    }

}

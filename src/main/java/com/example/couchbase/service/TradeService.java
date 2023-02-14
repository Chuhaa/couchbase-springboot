package com.example.couchbase.service;

import com.example.couchbase.model.payloads.Trade;
import com.example.couchbase.model.trade.TradeEntity;
import com.example.couchbase.model.trade.TradeFactory;
import com.example.couchbase.model.trade.TradeType;
import com.example.couchbase.repo.TradeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;

@Service
@Slf4j
public class TradeService {

    @Autowired
    TradeRepository tradeRepository;

    @Async
    public void saveTrade(TradeType tradeType) {
        TradeEntity tradeEntity = TradeFactory.getTradeEntityType(tradeType);
        Duration duration = Duration.ZERO;

        for (int i = 0; i < tradeType.getCount(); i++) {
            Trade tradeToBeInserted = tradeEntity.getTrade(i);
            Instant instantStart = Instant.now();
            tradeRepository.save(tradeToBeInserted);
            Instant instantEnd = Instant.now();
            duration = duration.plus(Duration.between(instantStart, instantEnd));
        }
        log.info("duration in seconds:" + duration.getSeconds());
        log.info("duration in millis:" + duration.toMillis());
        log.info("completed  times " + tradeType.getCount());
    }

    @Async
    public void getTrades(int totalRecords, int size) {
        Duration duration = Duration.ZERO;
        for (int i = 0; i < totalRecords / size; i++) {
            final Pageable pageRequest = PageRequest.of(i, size);
            Instant instantStart = Instant.now();
            tradeRepository.findAll(pageRequest);
            Instant instantEnd = Instant.now();
            duration = duration.plus(Duration.between(instantStart, instantEnd));
        }
        log.trace("duration in seconds:" + duration.getSeconds());
        log.trace("duration in millis:" + duration.toMillis());
    }

    public void deleteAll() {
        tradeRepository.deleteAll();
    }
}

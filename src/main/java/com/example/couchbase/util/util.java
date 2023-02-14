//package com.example.couchbase.util;
//
//import com.example.couchbase.model.payloads.Trade;
//import com.example.couchbase.model.trade.TradeEntity;
//import com.example.couchbase.model.trade.TradeFactory;
//import com.example.couchbase.model.trade.TradeType;
//import com.example.couchbase.repo.TradeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.time.Duration;
//import java.time.Instant;
//
//public class util {
//
//    @Autowired
//    TradeRepository tradeRepository;
//
//    public void bulkInsert(TradeType tradeType) {
//        TradeEntity tradeEntity = TradeFactory.getTradeEntityType(tradeType);
//        Duration duration= Duration.ZERO;
//
//        for (int i = 0; i < tradeType.getCount(); i++) {
//            Trade tradeToBeInserted = tradeEntity.getTrade(i);
//            Instant instantStart= Instant.now();
//            tradeRepository.save(tradeToBeInserted);
//            Instant instantEnd= Instant.now();
//            duration= duration.plus (Duration.between(instantStart, instantEnd));
//        }
//        System.out.println("duration in seconds:"+duration.getSeconds());
//        System.out.println("duration in millis:"+duration.toMillis());
//        System.out.println("completed  times "+tradeType.getCount());
//    }
//}

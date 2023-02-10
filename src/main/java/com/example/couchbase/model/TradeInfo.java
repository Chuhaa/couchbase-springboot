package com.example.couchbase.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

import java.util.ArrayList;

@Document
@Data
public class TradeInfo {
    @Id
    @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
    private String id;
    private Meta meta;
    private Trade trade;
    private ArrayList<TransferHistory> transferHistory;
}

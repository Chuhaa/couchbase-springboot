package com.example.couchbase.model.payloads;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

import java.time.Instant;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
    private String id;
    private Instant tradeTime;
    private Meta meta;
    private Party party;
    private int batchNumber; // Let's say batch size is 10,000.. and if we have 100,000th record will be in 10th batch.
    private int externalRefNumber;
    private ContractDetails contractDetails;

}

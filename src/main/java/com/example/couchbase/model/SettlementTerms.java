package com.example.couchbase.model;

import lombok.Data;

@Data
public class SettlementTerms {
    public Meta meta;
    public SettlementCurrency settlementCurrency;
    public SetttlementDate setttlementDate;
}

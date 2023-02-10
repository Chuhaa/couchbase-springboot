package com.example.couchbase.model;

import lombok.Data;

@Data
public class OptionPayout {
    public BuyerSeller buyerSeller;
    public ExerciseTerms exerciseTerms;
    public Meta meta;
    public ObservationTerms observationTerms;
    public String optionType;
    public PayerReceiver payerReceiver;
    public PriceQuantity priceQuantity;
    public SettlementTerms settlementTerms;
    public Underlier underlier;
}

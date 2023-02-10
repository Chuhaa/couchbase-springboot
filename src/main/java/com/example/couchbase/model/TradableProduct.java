package com.example.couchbase.model;

import lombok.Data;

import java.util.ArrayList;
@Data
public class TradableProduct {
    public ArrayList<CounterParty> counterParty;
    public Product product;
    public ArrayList<TradeLot> tradeLot;
}

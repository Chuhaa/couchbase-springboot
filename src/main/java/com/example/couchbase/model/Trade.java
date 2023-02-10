package com.example.couchbase.model;

import lombok.Data;

import java.util.ArrayList;
@Data
public class Trade {
    public ContractDetails contractDetails;
    public Meta meta;
    public ArrayList<Paty> paty;
    public TradableProduct tradableProduct;
    public TradeDate tradeDate;
    public ArrayList<TradeIdentifier> tradeIdentifier;
}

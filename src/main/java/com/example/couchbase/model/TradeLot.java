package com.example.couchbase.model;

import lombok.Data;

import java.util.ArrayList;
@Data
public class TradeLot {
    public ArrayList<PriceQuantity> priceQuantity;
}

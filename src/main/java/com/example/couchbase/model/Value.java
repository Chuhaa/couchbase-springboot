package com.example.couchbase.model;

import lombok.Data;

import java.util.ArrayList;
@Data
public class Value {
    public DelieveryDateReference delieveryDateReference;
    public String priceQuoteType;
    public ArrayList<ProductIdentifier> productIdentifier;
    public Identifier identifier;
    public Meta meta;
    public String source;
    public Frequency frequency;
    public Unit unit;
    public int value;
}

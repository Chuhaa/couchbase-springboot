package com.example.couchbase.model;

import lombok.Data;

@Data
public class StrikePrice {
    public PerUnitOf perUnitOf;
    public PriceExpression priceExpression;
    public Unit unit;
    public double value;
}

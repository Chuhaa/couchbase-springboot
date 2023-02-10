package com.example.couchbase.model;

import lombok.Data;

@Data
public class CalculationPeriodFrequency {
    public boolean balanceOfFirstPeriod;
    public Meta meta;
    public String period;
    public int periodMultiplier;
}

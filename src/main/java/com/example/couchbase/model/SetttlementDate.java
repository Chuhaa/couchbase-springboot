package com.example.couchbase.model;

import lombok.Data;

@Data
public class SetttlementDate {
    public AdjustableOrRelativeDate adjustableOrRelativeDate;
    public Meta meta;
    public DateAdjustments dateAdjustments;
    public String unAdjustedDate;
}

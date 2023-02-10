package com.example.couchbase.model;

import lombok.Data;

@Data
public class AdjustableDate {
    private DateAdjustments dateAdjustments;
    private Meta meta;
    private String unAdjustedDate;
}

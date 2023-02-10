package com.example.couchbase.model;

import lombok.Data;

@Data
public class ExpirationDate {
    public AdjustableDate adjustableDate;
    public Meta meta;
}

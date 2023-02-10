package com.example.couchbase.model;

import lombok.Data;

@Data
public class DelieveryNearBy {
    public Meta meta;
    public String period;
    public int periodMultiplier;
}

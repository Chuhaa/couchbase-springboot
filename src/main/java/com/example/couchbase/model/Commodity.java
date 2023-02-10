package com.example.couchbase.model;

import lombok.Data;

@Data
public class Commodity {
    public Address address;
    public Meta meta;
    public Value value;
}

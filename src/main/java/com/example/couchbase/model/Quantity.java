package com.example.couchbase.model;

import lombok.Data;

@Data
public class Quantity {
    public Meta meta;
    public Object value;   //   Value Class
    public Unit unit;
}

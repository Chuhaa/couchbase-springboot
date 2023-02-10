package com.example.couchbase.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class PriceQuantity {
    public Meta meta;
    public QuantitySchedule quantitySchedule;
    public Observable observable;
    public ArrayList<Quantity> quantity;
}

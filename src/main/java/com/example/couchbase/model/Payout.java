package com.example.couchbase.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Payout {
    public Meta meta;
    public ArrayList<OptionPayout> optionPayout;
}

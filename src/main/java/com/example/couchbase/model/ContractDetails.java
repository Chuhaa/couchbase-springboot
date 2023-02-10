package com.example.couchbase.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ContractDetails {
    public ArrayList<Documentation> documentation;
    public Meta meta;
}

package com.example.couchbase.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class BusinessCenters {
    public ArrayList<BusinessCenter> businessCenter;
    public Meta meta;
}

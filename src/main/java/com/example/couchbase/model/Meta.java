package com.example.couchbase.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Meta {
    public String globalKey;
    public String externalKey;
    public ArrayList<Location> location;
    public String scheme;
}

package com.example.couchbase.model;

import lombok.Data;

@Data
public class RelativeDate {
    public String businessConvention;
    public String dayType;
    public Meta meta;
    public String period;
    public int periodMultiplier;
}

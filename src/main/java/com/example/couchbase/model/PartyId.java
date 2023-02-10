package com.example.couchbase.model;

import lombok.Data;

@Data
public class PartyId {
    public Identifier identifier;
    public String identifierType;
    public Meta meta;
}

package com.example.couchbase.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Paty {
    public Meta meta;
    public Name name;
    public ArrayList<PartyId> partyId;
}

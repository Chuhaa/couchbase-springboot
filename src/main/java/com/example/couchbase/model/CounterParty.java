package com.example.couchbase.model;

import lombok.Data;

@Data
public class CounterParty {
    public PartyReference partyReference;
    public String role;
}

package com.example.couchbase.model;

import lombok.Data;

import java.util.ArrayList;
@Data
public class TradeIdentifier {
    public ArrayList<AssignedIdentifier> assignedIdentifier;
    public IssuerReference issuerReference;
    public Meta meta;
}

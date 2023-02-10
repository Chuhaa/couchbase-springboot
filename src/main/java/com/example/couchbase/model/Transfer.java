package com.example.couchbase.model;

import lombok.Data;

@Data
public class Transfer {
    public PayerReceiver payerReceiver;
    public Quantity quantity;
    public SetttlementDate setttlementDate;
    public TransferExpression transferExpression;
}

package com.example.couchbase.model;

import lombok.Data;

@Data
public class PayerReceiver {
    public String payer;
    public String receiver;
    public PayerPartyReference payerPartyReference;
    public ReceiverPartyReference receiverPartyReference;
}

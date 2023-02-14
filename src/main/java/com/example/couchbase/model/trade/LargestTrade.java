package com.example.couchbase.model.trade;


import com.example.couchbase.model.payloads.ContractDetails;
import com.example.couchbase.model.payloads.Meta;
import com.example.couchbase.model.payloads.Trade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.Instant;
import java.util.stream.Collectors;

public class LargestTrade extends  TradeEntity{

    private static String description="";

    public Trade getTrade(int i) {
        trade = new Trade();
        trade.setTradeTime(Instant.now());
        meta = new Meta();
        meta.setGlobalKey("LargestTrade");
        meta.setExternalKey("LargestTrade");
        trade.setMeta(meta);
        trade.setContractDetails(getContractDetails(i));
        trade.setExternalRefNumber(i);
        return trade;
    }

    public static ContractDetails getContractDetails(int i ) {

        ContractDetails contractDetails = new ContractDetails();
        contractDetails.setContractId(i);

        if(description.isEmpty()){
            ClassLoader classLoader = LargestTrade.class.getClassLoader();
            InputStream  inputStream=classLoader.getResourceAsStream("2MB.json");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            description =  (String)reader.lines().collect(Collectors.joining(System.lineSeparator()));
        }
        contractDetails.setDescription(description);
        return contractDetails;
    }

}

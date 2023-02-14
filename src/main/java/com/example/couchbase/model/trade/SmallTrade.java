package com.example.couchbase.model.trade;

import com.example.couchbase.model.payloads.ContractDetails;
import com.example.couchbase.model.payloads.Meta;
import com.example.couchbase.model.payloads.Trade;

import java.io.*;
import java.time.Instant;
import java.util.stream.Collectors;

public class SmallTrade extends  TradeEntity {

    private static String description="";
    public Trade getTrade(int i) {
        trade = new Trade();
        trade.setTradeTime(Instant.now());
        meta = new Meta();
        meta.setGlobalKey("SmallTrade");
        meta.setExternalKey("SmallTrade");
        trade.setMeta(meta);
        trade.setContractDetails(getContractDetails(i));
        trade.setExternalRefNumber(i);
        return trade;
    }

    public static ContractDetails getContractDetails(int i ) {

        ContractDetails contractDetails = new ContractDetails();
        contractDetails.setContractId(i);

        if(description.isEmpty()){


            ClassLoader classLoader = SmallTrade.class.getClassLoader();
            InputStream  inputStream=classLoader.getResourceAsStream("100KB.json");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            description =  (String)reader.lines().collect(Collectors.joining(System.lineSeparator()));
        }
        contractDetails.setDescription(description);
        return contractDetails;
    }

}

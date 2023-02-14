package com.example.couchbase.model.trade;

import com.example.couchbase.constants.TradeSizeEnum;

public class TradeFactory {

    public static TradeEntity getTradeEntityType(TradeType tradeType){

        switch(TradeSizeEnum.valueOf(tradeType.getSize().toUpperCase())) {
            case SMALL:
                return new SmallTrade();
            case MEDIUM:
                return new MediumTrade();
            case LARGE:
                return new LargeTrade();
            case LARGEST:
                return new LargestTrade();
            default:
                return new MiniTrade();
        }
    }
}

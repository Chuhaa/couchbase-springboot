package com.example.couchbase.repo;

import com.example.couchbase.model.payloads.Trade;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeRepository extends CouchbaseRepository<Trade, String> {

}

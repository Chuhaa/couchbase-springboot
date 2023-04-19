package com.example.couchbase.repo;

import com.example.couchbase.model.payloads.Trade;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TradeRepository extends CouchbaseRepository<Trade, String> {
    // Depth 1 record
    List<Trade> findByExternalRefNumber(Integer externalRefNumber);

//    // Depth 2 record
//    List<Trade> findByContractDetailsContractId(Integer contractId);
//
//    // Depth 4th Record
//    @Query("SELECT * FROM trade WHERE contractDetails.description.meta.globalKey': ?0")
//    List<Trade> findByContractDetailsDescriptionMetaGlobalKey(String globalKey);
}

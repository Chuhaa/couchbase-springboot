package com.example.couchbase.repo;

import com.example.couchbase.model.TradeInfo;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TradeRepository extends CouchbaseRepository<TradeInfo, String> {
    List<TradeInfo> findByMetaGlobalKey(String id);

    List<TradeInfo> findByTradeMetaGlobalKey(String id);

}

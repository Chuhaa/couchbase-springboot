package com.example.couchbase.repo;

import com.example.couchbase.model.Person;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CouchbaseRepository<Person, String> {

    List<Person> findByAddressCityPostalCode(int postalCode);

    List<Person> findByAddressStreet(String street);
}

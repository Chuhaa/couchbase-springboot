package com.example.couchbase.service;

import com.couchbase.client.core.error.HttpStatusCodeException;
import com.example.couchbase.model.Person;
import com.example.couchbase.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public void updatePerson(String id, Person person) {

        Optional<Person> existingPerson = personRepository.findById(id);
        if (existingPerson.isPresent()) {
            Person p = existingPerson.get();
            p.setName(person.getName());
            p.setAddress(person.getAddress());
            personRepository.save(p);
        }
    }
}

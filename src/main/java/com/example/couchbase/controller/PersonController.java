package com.example.couchbase.controller;

import com.example.couchbase.model.Person;
import com.example.couchbase.repo.PersonRepository;
import com.example.couchbase.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
@Slf4j
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonService personService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody final Person person) {
        //log.info("dfdf");
        System.out.println("as");
        personRepository.save(person);
    }

    @GetMapping("/{id}")
    public Person get(@PathVariable String id) {
        System.out.println("jj");
        Optional<Person> byId = personRepository.findById(id);
        return byId.orElse(null);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Person> listPersons() {
        return personRepository.findAll();
    }


    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable String id, @RequestBody Person person) {
        personService.updatePerson(id, person);
    }


    @GetMapping("/address/city/{postalCode}")
    public List<Person> search(@PathVariable int postalCode) {
        return personRepository.findByAddressCityPostalCode(postalCode);
    }

    @GetMapping("/address/{street}")
    public List<Person> searchByStreet(@PathVariable String street) {
        return personRepository.findByAddressStreet(street);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable String id) {
        personRepository.deleteById(id);
    }

}

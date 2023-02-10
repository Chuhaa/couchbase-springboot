//package com.example.couchbase.controller;
//
//import com.couchbase.client.java.Bucket;
//import com.couchbase.client.java.Cluster;
//import com.couchbase.client.java.Collection;
//import com.example.couchbase.model.Person;
//import com.example.couchbase.repo.PersonRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.*;
//
//
//
//@RestController
//@RequestMapping("/api/v1/profile")
//public class ProfileController {
//
//    private Cluster cluster;
//    private Collection profileCol;
//    private Bucket bucket;
//
//    @Autowired
//    PersonRepository personRepository;
//
//    @CrossOrigin(value = "*")
//    @PostMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
//    public String save(@RequestBody final Person person) {
//        //generates an id and save the user
//               personRepository.save(person);
//    return "Done";
//    }
//}
package com.example.usingdatajpawithh2database.controller;

import com.example.usingdatajpawithh2database.model.Person;
import com.example.usingdatajpawithh2database.repos.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    PersonRepo personRepo;

    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }

    @DeleteMapping(path = "/person/{pid}")
    public String deletePerson(@PathVariable("pid") int pid){
        Person person = personRepo.getOne(pid);
        personRepo.delete(person);
        return "Deleted";
    }

    @PutMapping(path = "/person")
    public Person saveOrUpdatePerson(@RequestBody Person person){
        personRepo.save(person);
        return person;
    }

    @PostMapping(value = "/addPerson", consumes = {"application/json", "application/xml"})
    public Person addPerson(@RequestBody Person person){
        System.out.println(person.toString());
        personRepo.save(person);
        return person;
    }

    @GetMapping(path = "/allPersons", produces = {"application/xml", "application/json"})
    public List<Person> getAllPersons(){
        System.out.println("into getAllPersons");
        return personRepo.findAll();
    }

    @GetMapping("/getPerson/{pid}")
    public Optional<Person> getPerson(@PathVariable("pid") int pid){
        System.out.println("into getPerson");
        return personRepo.findById(pid);
    }

}

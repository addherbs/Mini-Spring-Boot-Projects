package com.example.usingdatajpawithh2database.controller;

import com.example.usingdatajpawithh2database.model.Person;
import com.example.usingdatajpawithh2database.repos.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
public class PersonController {

    @Autowired
    PersonRepo personRepo;

    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }

    @RequestMapping("/addPerson")
    public String addPerson(Person person){
        System.out.println("Came to Add Person");
        System.out.println(person.toString());
        personRepo.save(person);
        return "home.jsp";
    }

    @ResponseBody
    @RequestMapping("/allPersons")
    public List<Person> getAllPersons(){
        System.out.println("into getAllPersons");
        return personRepo.findAll();
    }

    @ResponseBody
    @RequestMapping("/getPerson/{pid}")
    public Optional<Person> getPerson(@PathVariable("pid") int pid){
        System.out.println("into getPerson");
        return personRepo.findById(pid);
    }

}

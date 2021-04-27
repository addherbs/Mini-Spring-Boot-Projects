package com.example.usingdatajpawithh2database.controller;

import com.example.usingdatajpawithh2database.model.Person;
import com.example.usingdatajpawithh2database.repos.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/getPerson")
    public String getPerson(@RequestParam int pid){
        System.out.println("Came to Get Person");
        Person personObj = (Person) personRepo.findAllByPid(pid);
        return "home.jsp";
    }

}

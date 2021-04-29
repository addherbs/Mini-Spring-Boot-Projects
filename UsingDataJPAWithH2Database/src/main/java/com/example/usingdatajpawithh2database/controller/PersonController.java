package com.example.usingdatajpawithh2database.controller;

import com.example.usingdatajpawithh2database.model.Person;
import com.example.usingdatajpawithh2database.repos.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("/allPersons")
    public ModelAndView getAllPersons(){

        ModelAndView mv = new ModelAndView("showPerson.jsp");
        List<Person> person = personRepo.findAll();
        mv.addObject("obj", person);

        System.out.println(person.toString());

        return mv;
    }

    @RequestMapping("/getPerson")
    public ModelAndView getPerson(@RequestParam int pid){
        Person person = personRepo.findById(pid).orElse(new Person());
        ModelAndView mv = new ModelAndView("showPerson.jsp");
        mv.addObject("obj", person);

        System.out.println(person.toString());

        return mv;
    }

}

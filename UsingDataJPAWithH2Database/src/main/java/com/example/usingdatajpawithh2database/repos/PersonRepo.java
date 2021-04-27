package com.example.usingdatajpawithh2database.repos;

import com.example.usingdatajpawithh2database.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepo extends CrudRepository<Person, Integer> {

    List<Person> findAllByPid(int id);
}

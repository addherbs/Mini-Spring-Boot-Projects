package com.example.usingdatajpawithh2database.repos;

import com.example.usingdatajpawithh2database.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}

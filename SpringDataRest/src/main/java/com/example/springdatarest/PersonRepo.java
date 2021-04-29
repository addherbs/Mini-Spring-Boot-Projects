package com.example.springdatarest;

import com.example.springdatarest.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
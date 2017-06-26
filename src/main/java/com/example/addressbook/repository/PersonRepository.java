package com.example.addressbook.repository;

import com.example.addressbook.model.Person;

import java.util.List;
import java.util.Optional;

/**
 * Created by davidanton on 19/6/17.
 */
public interface PersonRepository  {
    Person save(Person person);

    Person update(Person person);

    void delete(Person person);

    Optional<Person> getById(Long id);

    List<Person> findAll();
}

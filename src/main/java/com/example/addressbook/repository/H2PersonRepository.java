package com.example.addressbook.repository;

import com.example.addressbook.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Created by davidanton on 19/6/17.
 */
@Profile("h2")
@Component
public class H2PersonRepository implements PersonRepository {

    @Autowired
    PersonRepository jpaPersonRepository;

    @Override
    public Person save(Person person) {
        return jpaPersonRepository.save(person);
    }

    @Override
    public Person update(Person person) {
        return jpaPersonRepository.update(person);
    }

    @Override
    public void delete(Person person) {
        jpaPersonRepository.delete(person);
    }

    @Override
    public Optional<Person> getById(Long id) {
        return jpaPersonRepository.getById(id);
    }

    @Override
    public List<Person> findAll() {
        return jpaPersonRepository.findAll();
    }
}

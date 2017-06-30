package com.example.addressbook.repository;

import com.example.addressbook.model.Person;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Created by davidanton on 19/6/17.
 */
@Profile("mongo")
@Component
public class MongoPersonRepository implements PersonRepository {

    private final JPAPersonRepository jpaPersonRepository;

    MongoPersonRepository(JPAPersonRepository jpaPersonRepository){
        this.jpaPersonRepository = jpaPersonRepository;
    }

    @Override
    public Person save(Person person) {
        return jpaPersonRepository.save(person);
    }

    @Override
    public Person update(Person person) {
        return jpaPersonRepository.save(person);
    }

    @Override
    public void delete(Person person) {
        jpaPersonRepository.delete(person);
    }

    @Override
    public Optional<Person> getById(Long id) {
        return jpaPersonRepository.findById(id);
    }

    @Override
    public List<Person> findAll() {
        return jpaPersonRepository.findAll();
    }
}

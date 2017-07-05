package com.example.addressbook.repository;

import com.example.addressbook.model.Person;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Created by davidanton on 19/6/17.
 */
@Profile("h2")
@Component
public class H2PersonRepositoryImpl implements PersonRepository {

    private final JPAPersonRepository basePersonRepository;

    H2PersonRepositoryImpl(JPAPersonRepository basePersonRepository){
        this.basePersonRepository = basePersonRepository;
    }

    @Override
    public Person save(Person person) {
        return basePersonRepository.save(person);
    }

    @Override
    public Person update(Person person) {
        return basePersonRepository.save(person);
    }

    @Override
    public void delete(Person person) {
        basePersonRepository.delete(person);
    }

    @Override
    public Optional<Person> getById(Long id) {
        return basePersonRepository.findById(id);
    }

    @Override
    public List<Person> findAll() {
        return basePersonRepository.findAll();
    }
}

package com.example.addressbook.repository;

import com.example.addressbook.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

/**
 * Created by davidanton on 19/6/17.
 */
public interface MongoPersonRepository extends MongoRepository<Person, Long>, PersonRepository {

    @Query("{id:'?0'}")
    public Optional<Person> getById(Long id);

}

package com.example.addressbook.repository;

import com.example.addressbook.model.Person;
import com.mongodb.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Created by davidanton on 19/6/17.
 */
@Profile("mongo")
@Component
public class MongoPersonRepositoryImpl implements PersonRepository {

    private final JPAPersonRepository basePersonRepository;

    MongoPersonRepositoryImpl(JPAPersonRepository basePersonRepository){
        this.basePersonRepository = basePersonRepository;
    }

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public Person save(Person person) {
        return null;
    }

    @Override
    public Person update(Person person) {
        Query query = new Query(Criteria.where("person").is(person));
        Update update = new Update();

        // TODO:

        WriteResult result = mongoTemplate.updateFirst(query, update, Person.class);

        return person;
    }

    @Override
    public void delete(Person person) {

    }

    @Override
    public Optional<Person> getById(Long id) {
        return null;
    }

    @Override
    public List<Person> findAll() {
        return null;
    }
}

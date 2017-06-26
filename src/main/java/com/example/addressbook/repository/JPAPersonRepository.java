package com.example.addressbook.repository;

import com.example.addressbook.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by davidanton on 19/6/17.
 */
public interface JPAPersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByLastName(String lastName);
}

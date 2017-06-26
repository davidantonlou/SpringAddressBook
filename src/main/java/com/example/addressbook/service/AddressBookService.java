package com.example.addressbook.service;

import com.example.addressbook.model.Person;

import java.util.List;

/**
 * Created by davidanton on 19/6/17.
 */
public interface AddressBookService {
    public List<Person> getAllPersons();

    public void addPerson(Person person);

}

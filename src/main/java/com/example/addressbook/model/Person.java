package com.example.addressbook.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by davidanton on 19/6/17.
 */
@Entity
public class Person {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private String company;

    public Person(long id, String firstName, String lastName, String email, String mobile, String company) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.company = company;
    }

    public Person() {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCompany() { return company; }

    public void setCompany(String company) { this.company = company; }

    @Override
    public String toString(){
        return this.getId() + "|" + this.getFirstName() + "|" + this.getLastName() + "|" +
                this.getCompany() + "|" + this.getEmail() + "|" + this.getMobile();
    }
}

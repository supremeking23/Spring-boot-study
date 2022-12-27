package com.example.fintech_app.fintech_application.practice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerTest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String firstname;
    private String lastname;

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    /*
    * The default constructor exists only for the sake of JPA. You do not use it directly, so it is designated as protected
    * */
    protected CustomerTest(){

    }

    public CustomerTest(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "CustomerTest{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}

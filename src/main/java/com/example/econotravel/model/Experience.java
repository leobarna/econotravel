package com.example.econotravel.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table
public class Experience implements Serializable {
    //atribute id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String  name;
    private BigDecimal pricePerPerson;

    //constructor
    public Experience(String name, BigDecimal pricePerPerson) {
        this.name = name;
        this.pricePerPerson = pricePerPerson;
    }
    //Class 'Experience' should have [public, protected] no-arg constructor
    public Experience() {

    }

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPricePerPerson() {
        return pricePerPerson;
    }

    public void setPricePerPerson(BigDecimal pricePerPerson) {
        this.pricePerPerson = pricePerPerson;
    }
}



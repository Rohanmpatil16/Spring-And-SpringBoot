package com.hibernate.demo.Hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Demo {

    @Id
    private int id;

    private String name;
    private String company;

    public Demo() {
    }

    public Demo(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
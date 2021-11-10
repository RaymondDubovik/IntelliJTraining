package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExampleEntity {

    /*
    Run the project. Setup database connection in IntelliJ (dbName=exampledb, username=root, password=root)
    Copy the following queries into the database console.
    Highlight the first query and run it. Highlight the first line of the first query and run it. As you can see, only highlighted part of the query was executed.


    SELECT * FROM example_entity WHERE name='Your name'
    UNION
    SELECT * FROM example_entity WHERE name='My name';
    ----------
    SELECT * FROM example_entity WHERE id IN (SELECT id FROM example_entity WHERE name='Your name');
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

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
}

package com.example.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.entity.ExampleEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SetupService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void setupEntities() {
        ExampleEntity entity = new ExampleEntity();
        entity.setName("My name");
        entityManager.persist(entity);

        ExampleEntity entity2 = new ExampleEntity();
        entity2.setName("Your name");
        entityManager.persist(entity2);
    }
}

package ua.nix.akolovych.utils;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Objects;

public class EntityManagerFactoryUtil {
    private final static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("CarManager");
    private static EntityManager entityManager;

    public static EntityManager getEntityManager(){
        if(Objects.isNull(entityManager)){
            entityManager = entityManagerFactory.createEntityManager();
        }
        return entityManager;
    }
}

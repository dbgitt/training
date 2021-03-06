package org.framework.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public enum PersistenceManager {

    INSTANCE;
    private EntityManagerFactory emFactory;

    PersistenceManager() {
        // "jpa-example" was the value of the name attribute of the
        // persistence-unit element.
        emFactory = Persistence.createEntityManagerFactory("jpa_example");
    }

    public EntityManager getEntityManager() {
        return emFactory.createEntityManager();
    }

    public void close() {
        emFactory.close();
    }
}

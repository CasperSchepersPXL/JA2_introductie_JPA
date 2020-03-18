package be.pxl.ja2.jpa;

import be.pxl.ja2.jpa.model.Message;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Opdracht1SaveMessage {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("musicdb_pu");
            entityManager = entityManagerFactory.createEntityManager();

            Message message1 = new Message(1, "Hallo");
            Message message2 = new Message(2, "Ola");
            Message message3 = new Message(3, "Hello");

            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

            entityManager.persist(message1);
            entityManager.persist(message2);
            entityManager.persist(message3);
            transaction.commit();

        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            if (entityManagerFactory != null) {
                entityManagerFactory.close();
            }
        }
    }
}
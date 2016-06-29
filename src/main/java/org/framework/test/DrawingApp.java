package org.framework.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import javax.persistence.EntityManager;

@SuppressWarnings("deprecation") public class DrawingApp {

    public DrawingApp() {
        // SPRING
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        // Voor het aanmaken van Circle wordt het volgende statement vervangen
        // Circle c = new Circle();
        Circle c = (Circle) factory.getBean("circle");
        c.draw();
        c.getMessage();

        // JPA
        TableTest tableTest = new TableTestt();

        tableTest.setName("Javaantje");

        EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
        em.getTransaction().begin();
        em.persist(tableTest);
        em.getTransaction().commit();
        em.close();
        PersistenceManager.INSTANCE.close();
    }

    public static void main(String[] args) {
        new DrawingApp();
    }
}

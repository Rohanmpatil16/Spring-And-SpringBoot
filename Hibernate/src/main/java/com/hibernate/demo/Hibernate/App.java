package com.hibernate.demo.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Demo.class);

        SessionFactory sessionFactory =
                configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("Rohan");
        demo.setCompany("OpenAI");

        session.persist(demo);

        transaction.commit();

        session.close();
        sessionFactory.close();

        System.out.println("Data inserted successfully!");
    }
}
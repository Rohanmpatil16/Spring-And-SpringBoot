package com.rohan;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        student s1 = new student("Rahul", "Bsc", 4500);

        session.persist(s1); 

        tx.commit();

        session.close();

        System.out.println("Student saved");
    }
}
package com.rohan;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory factory1;

    public static SessionFactory getSessionFactory() {

        if (factory1 == null) {
            factory1 = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();
        }

        return factory1;
    }
}
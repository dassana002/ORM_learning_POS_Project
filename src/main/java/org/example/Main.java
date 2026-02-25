package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    static void main() {

        // Introduce Hibernate Configurations to Project
        try {
            /**
                * Create Hibernate configuration object.
                * Create Session Factory (Hibernate engine)
                * Load hibernate.configuration.xml file
                * Introducing table to Hibernate.
                * Configuration finalized and Session Factory Create
            **/
            SessionFactory sessionFactory = new Configuration()
                    .configure("hibernate.configuration.xml")
                    .addAnnotatedClass(Customer.class)
                    .buildSessionFactory();

            /**
             *  Session Opening (Database Conversion)
             * **/
            Session session = sessionFactory.openSession();

            /**
             * Transaction begin (transaction ensures)
             * **/
            Transaction transaction = session.beginTransaction();

            Customer customer = new Customer();
            customer.setName("Thiwanka");
            customer.setAddress("Horana");

            // Object Save
            session.save(customer);

            // Transaction commit
            transaction.commit();

            // Session close
            session.close();

            // Session Factory close
            sessionFactory.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

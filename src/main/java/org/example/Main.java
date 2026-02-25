package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    static void main() {
        try {
            // Introduce Hibernate Configurations to Project
            SessionFactory sessionFactory = new Configuration()
                    .configure("hibernate.configuration.xml")
                    .addAnnotatedClass(Customer.class)
                    .buildSessionFactory();

            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();

            Customer customer = new Customer();
            customer.setName("Thiwanka");
            customer.setAddress("Horana");

            session.save(customer);
            transaction.commit();

            session.close();
            sessionFactory.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

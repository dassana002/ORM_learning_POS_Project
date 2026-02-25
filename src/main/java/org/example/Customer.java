package org.example;

import jakarta.persistence.*;

// Entity Mapping
@Entity
// Table Name for DB
@Table(name = "customers")
public class Customer {

    // Primary key
    @Id
    // How to Generate Value
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;
    private String address;

}

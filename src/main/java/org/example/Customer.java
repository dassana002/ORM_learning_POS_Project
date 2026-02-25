package org.example;

import jakarta.persistence.*; // JPA Specification
import lombok.*;

// Java Hibernate Annotations
// Object and DB Entity Mapping
@Entity
// Table Name for DB
@Table(name = "customers")

// Lombok Annotations
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {

    // Primary key
    @Id
    // How to Generate Value
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;
    private String address;

}

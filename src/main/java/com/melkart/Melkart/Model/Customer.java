package com.melkart.Melkart.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cus_id")
    private Long customerId;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String country;
    private Integer postalCode;
    private String state;
    private String city;

    private String phoneNumber;
    private LocalDate dateOfBirth;
    private LocalDate registeredDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;

   @OneToOne(mappedBy = "customer" , cascade = CascadeType.ALL)
    private Buyer buyers;





}

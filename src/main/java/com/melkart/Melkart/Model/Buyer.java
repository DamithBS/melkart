package com.melkart.Melkart.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "buyers")
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long buyerID;
    private Integer totalOrders;
    private String preferredPaymentMethod;

    @Enumerated(EnumType.STRING)
    private VerifiedPhone phoneVerificationStatus;

    @OneToOne
    @MapsId
    @JoinColumn(name = "cus_id")
    private Customer customer;


}

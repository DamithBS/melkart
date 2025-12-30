package com.melkart.Melkart.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "travellers")
public class Traveller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long travellerId;

    private String passportNumber;
    private LocalDate passportExpiryDate;
    private LocalDate registeredDate;
    private String passportImageUrl;

    private String deliverySuccessRate;
    private BigDecimal onTimeRate;
    private BigDecimal positiveFeedbackRate;

    private Long travellerLevel;
    private Long totalDeliveries;

    @OneToOne
    @MapsId
    @JoinColumn(name = "cus_id")
    private Customer customer;


}

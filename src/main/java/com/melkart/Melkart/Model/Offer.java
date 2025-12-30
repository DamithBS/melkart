package com.melkart.Melkart.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "offers")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long offerId;
    private Boolean acceptedTerms;
    private Integer price;
    private LocalDate deliveryDate;

    @ManyToOne
    @JoinColumn(name = "tripId")
    private Trip trip;
}

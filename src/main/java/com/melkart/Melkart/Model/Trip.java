package com.melkart.Melkart.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "trips")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tripId;

    private String originCountry;
    private String originCity;
    private String destinationCountry;
    private String destinationCity;
    private LocalDate departureDate;
    private LocalDate returnDate;
    private Integer availableWeight;
    private Integer availableVolume;

    @Enumerated(EnumType.STRING)
    private TripStatus tripStatus;

    @OneToMany(mappedBy = "trip")
    private List<Offer>offers;

}

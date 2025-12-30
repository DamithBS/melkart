package com.melkart.Melkart.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private String productName;
    private Integer productPrice;
    private Integer quantity;
    private String productDescription;
    private String imageUrl;
    private String deliverTo;
    private String deliverFrom;
    private LocalDate deliverBefore;
    private Long totalAmount;

    @ManyToOne
    @JoinColumn(name = "sys_price_id")
    private SystemPrice systemPrice;

}

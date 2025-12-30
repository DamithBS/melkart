package com.melkart.Melkart.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "payments")
public class Payment {
    @Column (name = "pay_id")
    private Long paymentId;

    private String transactionID;
    private LocalDate paymentDate;
    private Long totalAmount;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;
}

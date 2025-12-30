package com.melkart.Melkart.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "system_prices")
public class SystemPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sys_price_id")
    private Long systemPriceId;

    //product cost
    private Integer melkartFee;
    private Integer taxFee;
    private Integer travelerReward;
    private Integer processingFee;

    @OneToMany(mappedBy = "SystemPrice")
    private List<Order> orders;


}

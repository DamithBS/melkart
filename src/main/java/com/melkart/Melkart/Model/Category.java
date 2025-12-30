package com.melkart.Melkart.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_id")
    private Long categoryId;
    private String categoryName;

    @OneToMany(mappedBy = "category")
    private List<Product> products;


}

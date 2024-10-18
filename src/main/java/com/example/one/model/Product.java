package com.example.one.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Products")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    @Id
    private int proId;
    private String proName;
    private int price;
}

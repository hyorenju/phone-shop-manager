package com.example.phoneshopmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200)
    private String name;

    @Column
    private Long inventory;

    @Column(name = "unit_price")
    private Float unitPrice;

    @Column
    private String supplier;

    @ManyToOne
    @JoinColumn(name = "importing_id")
    private InventoryImporting inventoryImporting;
}

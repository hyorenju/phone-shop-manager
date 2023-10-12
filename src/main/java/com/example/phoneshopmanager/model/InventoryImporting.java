package com.example.phoneshopmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "inventory_importing")
public class InventoryImporting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "inventoryImporting", cascade = CascadeType.ALL)
    private Collection<Product> products;

    @Column
    private Integer quantity;

    @Column(name = "import_date")
    private Timestamp importDate;
}

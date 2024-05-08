package com.sahelcrea.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity // Déclarer la classe comme Entity pour la persistance des données
@Table(name = "product_category") // Le nom de la table dans la BD
@Data // Pour la génération des Getters/Setters/Constructeur sans argument/ constructeur avec arugment
public class ProductCategory {
    @Id // Identifier notre ID
    @GeneratedValue (strategy = GenerationType.IDENTITY) // Clé primaire et Auto-incrementation
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    // RELATION 1ère: une PRODUCT-CATEGORY peut avoir plusieurs PRODUCT
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;
}

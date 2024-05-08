package com.sahelcrea.ecommerce.dao;

import com.sahelcrea.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Cette interface va étendre de JpaRepostory avec l'Entity Product, et type de son ID
public interface ProductRepository extends JpaRepository<Product, Long> {

}

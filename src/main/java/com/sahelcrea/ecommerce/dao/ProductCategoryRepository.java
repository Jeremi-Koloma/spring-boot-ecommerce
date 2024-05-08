package com.sahelcrea.ecommerce.dao;

import com.sahelcrea.ecommerce.entities.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// Cette interface va étendre de JpaRepository avec l'Entity PRODUCT-CATEGORY, et le type de son ID
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}

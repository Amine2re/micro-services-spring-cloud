package com.matsoft.dao;

import com.matsoft.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface InventoryRepository extends JpaRepository<Product,Long> {
}

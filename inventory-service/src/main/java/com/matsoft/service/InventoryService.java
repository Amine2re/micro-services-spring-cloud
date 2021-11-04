package com.matsoft.service;

import com.matsoft.dao.InventoryRepository;
import com.matsoft.model.Product;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public void addData(){
        inventoryRepository.save(new Product(null,"Lait",750));
    }
}

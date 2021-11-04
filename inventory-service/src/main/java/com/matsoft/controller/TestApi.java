package com.matsoft.controller;

import com.matsoft.service.InventoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {
    InventoryService inventoryService;

    public TestApi(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping("/addDataInventory")
    public void addDataToInventory(){
        inventoryService.addData();
    }
}

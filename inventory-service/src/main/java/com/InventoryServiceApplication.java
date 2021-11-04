package com;

import com.matsoft.dao.InventoryRepository;
import com.matsoft.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(InventoryRepository customerRepository) {
		return args -> {
			customerRepository.save(new Product(null, "Lait", 850));
			customerRepository.save(new Product(null, "Farine", 1500));
			customerRepository.save(new Product(null, "Alumette", 200));
			customerRepository.findAll().forEach(System.out::println);
		};
	}
}

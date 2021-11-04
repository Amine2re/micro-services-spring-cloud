package com.matSoft;


import com.matSoft.dto.CustomerRepository;
import com.matSoft.model.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.save(new Customer(null, "Toure", "lallana2re@hotmail.com"));
			customerRepository.save(new Customer(null, "Diop", "ndeyeDior@otmail.com"));
			customerRepository.save(new Customer(null, "Diome", "lextimide@gmail.com"));
			customerRepository.findAll().forEach(System.out::println);
		};
	}
}

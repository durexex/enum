package com.durex.enums;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.durex.enums.entities.Order;
import com.durex.enums.enums.OrderStatus;
import com.durex.enums.repositories.OrderRepository;


@SpringBootApplication
public class EnumsApplication implements CommandLineRunner {

	
	@Autowired
	private OrderRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(EnumsApplication.class, args);
	}

	

	@Override
	public void run(String... args) throws Exception {

		Order o1 = new Order(null, Instant.parse("2021-12-20T21:04:00Z"), OrderStatus.PAID);
		Order o2 = new Order(null, Instant.parse("2022-01-23T22:05:07Z"), OrderStatus.WAINTING_PAYYMENT);
		Order o3 = new Order(null, Instant.parse("2022-01-24T12:15:07Z"), OrderStatus.WAINTING_PAYYMENT);

		repository.saveAll(Arrays.asList(o1, o2, o3));

	}
	
}

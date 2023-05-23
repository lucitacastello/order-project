package com.acrdev.order.order;

import com.acrdev.order.order.entities.Order;
import com.acrdev.order.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {

	@Autowired
	private OrderService service;
	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1309, 95.9, 0.0);
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$ " + service.total(order));
	}
}

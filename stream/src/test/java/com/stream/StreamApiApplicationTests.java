package com.stream;

import com.stream.model.Order;
import com.stream.model.Product;
import com.stream.repo.CustomerRepository;
import com.stream.repo.OrderRepository;
import com.stream.repo.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@SpringBootTest
class StreamApiApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Test
	@DisplayName("Obtain list of products with with category = \"Books\" and price > 100")
	public void exercise1(){
		List<Product> products = productRepository.findAll()
				.stream()
				.filter(p -> p.getCategory() == "Books")
				.filter(p -> p.getPrice() > 100)
				.collect(Collectors.toList());

		products.forEach(p -> log.info(p.toString()));

	}

	@Test
	@DisplayName("Obtain a list of order with product category = \"Baby\"")
	public void exercise2(){
		List<Order> orders = orderRepository.findAll()
				.stream()
				.filter(o -> o.getProducts()
						.stream()
						.anyMatch(p -> p.getCategory() == "Baby")
				)
				.collect(Collectors.toList());
		orders.forEach(o -> log.info(o.toString()));
	}

}

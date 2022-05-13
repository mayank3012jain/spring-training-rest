package com.cisco.training.web.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("product-app")
public interface ProductMicroService {

	// GET /products/id  ----> 200+json or 404
	@GetMapping("/products/{id}")
	public String getProductById(@PathVariable("id") int id);
}


package com.cisco.training.web;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.cisco.training.dao.ReviewsRepository;
import com.cisco.training.domain.Review;

@RestController
public class ReviewsController {
	
	@Autowired
	ReviewsRepository dao;

	@Value("${product.url}")
	String productServiceBaseUrl;
  
  
	@GetMapping("/reviews") // /reviews?pid=1
	public List<Review> getReviewsForAProduct(@RequestParam("pid") int productId){
		return dao.findByPid(productId);
	}
	
	@PostMapping("/reviews")
	public ResponseEntity addReview(@RequestBody Review review) {
		RestTemplate rt = new RestTemplate();
		try {
			System.out.println("MJ-----");
			rt.getForObject(productServiceBaseUrl+"/products/{id}", String.class, review.getPid());
			Review saved = dao.save(review);
			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(URI.create("/reviews/"+saved.getId()));
			return new ResponseEntity(saved, headers, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}


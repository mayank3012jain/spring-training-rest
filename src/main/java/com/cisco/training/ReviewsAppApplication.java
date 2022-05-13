package com.cisco.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cisco.training.dao.ReviewsRepository;
import com.cisco.training.domain.Review;

@SpringBootApplication
public class ReviewsAppApplication {

	public static void main(String[] args) {
//		ApplicationContext springContainer = 
				SpringApplication.run(ReviewsAppApplication.class, args);
		
//		ReviewsRepository bean = springContainer.getBean(ReviewsRepository.class);
//		Review r = new Review(2, "MJ", "good", 3);
//		bean.save(r);
	}


}

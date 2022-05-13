package com.cisco.training.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cisco.training.domain.Review;

@Repository
public interface ReviewsRepository extends CrudRepository<Review, Integer>{
	List<Review> findByPid(int pid);
}

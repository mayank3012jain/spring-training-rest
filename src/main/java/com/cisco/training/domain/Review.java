package com.cisco.training.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity()
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "review_id")
	int id;
	
	@Column(name = "pid")
	int pid;
	
	@Column(name = "reviewer")
	String reviewer;
	
	@Column(name = "review_text")
	String reviewText;
	
	@Column(name = "rating")
	int rating;
	
	public Review() {
		
	}

	public Review(int pid, String reviewer, String reviewText, int rating) {
		super();
		this.pid = pid;
		this.reviewer = reviewer;
		this.reviewText = reviewText;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getReviewer() {
		return reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
}

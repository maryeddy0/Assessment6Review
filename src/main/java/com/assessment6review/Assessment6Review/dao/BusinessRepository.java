package com.assessment6review.Assessment6Review.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessment6review.Assessment6Review.entity.Business;

public interface BusinessRepository extends JpaRepository <Business, Integer> {

	Business findByName(String name);
	
}

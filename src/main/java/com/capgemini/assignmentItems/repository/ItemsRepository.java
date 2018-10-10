package com.capgemini.assignmentItems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.assignmentItems.entity.Items;
import com.capgemini.assignmentItems.entity.Order;

public interface ItemsRepository extends JpaRepository<Items, Integer> {
	
	

}

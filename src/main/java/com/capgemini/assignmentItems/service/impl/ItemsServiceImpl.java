package com.capgemini.assignmentItems.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.assignmentItems.entity.Items;
import com.capgemini.assignmentItems.repository.ItemsRepository;
import com.capgemini.assignmentItems.service.ItemsService;
@Service
public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private ItemsRepository repo;
	@Override
	public Items addItem(Items item) {
		return repo.save(item);
	}

}

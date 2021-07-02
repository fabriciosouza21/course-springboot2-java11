package com.fsm.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsm.entities.Category;
import com.fsm.services.CategoryServices;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {
	
	@Autowired
	CategoryServices services;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		
		List<Category> list;
		list = services.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = services.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}

package com.fsm.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsm.entities.User;
import com.fsm.services.UserServices;

@RestController
@RequestMapping(value = "/user")
public class UserResources {
	
	@Autowired
	UserServices userServices;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		
		List<User> list;
		list = userServices.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = userServices.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}

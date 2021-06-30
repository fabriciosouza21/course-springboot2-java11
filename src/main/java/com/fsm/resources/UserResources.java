package com.fsm.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsm.entities.User;

@RestController
@RequestMapping(value = "/user")
public class UserResources {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "fabricio", "fabriciosouz@gmail.com", "999999", "1234567");
		return ResponseEntity.ok().body(u);
	}
}

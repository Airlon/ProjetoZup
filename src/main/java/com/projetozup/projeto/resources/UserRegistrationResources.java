package com.projetozup.projeto.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projetozup.projeto.domain.UserRegistration;
import com.projetozup.projeto.services.UserRegistrationService;

@RestController
@RequestMapping(value= "/registration")
public class UserRegistrationResources {
	
	@Autowired
	private UserRegistrationService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		UserRegistration obj = service.find(id);
		return ResponseEntity.ok().body(obj);
		
	}
	


}

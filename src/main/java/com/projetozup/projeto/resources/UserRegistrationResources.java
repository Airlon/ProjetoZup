package com.projetozup.projeto.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projetozup.projeto.domain.UserRegistration;

@RestController
@RequestMapping(value= "/registration")
public class UserRegistrationResources {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<UserRegistration> Listar() {
		
		UserRegistration re1 = new UserRegistration("Airlon Servulo","airlon.servulo@outlook.com","31/07/1996","38933112898");
		UserRegistration re2 = new UserRegistration("Cibelly Fabiano","cibelly.carvalho@gmail.com","24/10/2001","44396979843");
		
		List<UserRegistration> lista = new ArrayList<>(); 
		 lista.add(re1); 
		 lista.add(re2); 
		 
		 return lista; 
		
		
	}
	


}

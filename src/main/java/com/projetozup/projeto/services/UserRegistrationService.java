package com.projetozup.projeto.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetozup.projeto.domain.UserRegistration;
import com.projetozup.projeto.repositories.UserRegistrationRepository;
import com.projetozup.projeto.services.exceptions.ObjectNotFoundException;

@Service
public class UserRegistrationService {
	
	@Autowired
	private UserRegistrationRepository repo;
	
	public UserRegistration find(Integer id) { 
		 Optional<UserRegistration> obj = repo.findById(id); 
		 return obj.orElseThrow(() -> new ObjectNotFoundException( 
				 "Objeto não encontrado! Id: " + id + ", Tipo: " + UserRegistration.class.getName())); 
		
	}

}

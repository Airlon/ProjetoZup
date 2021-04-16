package com.projetozup.projeto;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projetozup.projeto.domain.UserRegistration;
import com.projetozup.projeto.repositories.UserRegistrationRepository;

@SpringBootApplication
public class ProjetoZupApplication implements CommandLineRunner {
	
    @Autowired
	private UserRegistrationRepository userRegistrationRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoZupApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

	UserRegistration reg1 = new UserRegistration (null,"Airlon Servulo","airlon.servulo@outlook.com","31/07/1996","38933112898");
	UserRegistration reg2 = new UserRegistration (null,"Cibelly Carvalho","cibelly.carvalho404@gmail.com","24/10/2001","44396979843");
		
	userRegistrationRepository.saveAll(Arrays.asList(reg1, reg2));
	
	
	}

}

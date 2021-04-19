package com.projetozup.projeto;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projetozup.projeto.domain.RegistrationAddress;
import com.projetozup.projeto.domain.UserRegistration;
import com.projetozup.projeto.repositories.RegistrationAddressRepository;
import com.projetozup.projeto.repositories.UserRegistrationRepository;

@SpringBootApplication
public class ProjetoZupApplication implements CommandLineRunner {
	
    @Autowired
	private UserRegistrationRepository userRegistrationRepository;
    @Autowired
    private RegistrationAddressRepository registrationAddressRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoZupApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

	UserRegistration reg1 = new UserRegistration (null,"Airlon Servulo","airlon.servulo@outlook.com","31/07/1996","38933112898");
	UserRegistration reg2 = new UserRegistration (null,"Cibelly Carvalho","cibelly.carvalho404@gmail.com","24/10/2001","44396979843");
	
	RegistrationAddress ad1 = new RegistrationAddress (null,"Rua", 433, "Casa 2","Parque Grajau", "São Paulo", "SP", "04849610");
	RegistrationAddress ad2 = new RegistrationAddress (null,"Avenida", 9585, "Apartamento ","Parque Maria", "São Paulo", "SP", "04888110");
	
	reg1.getAddress().addAll(Arrays.asList(ad2));
	reg2.getAddress().addAll(Arrays.asList(ad1));
	
	ad1.getUser().addAll(Arrays.asList(reg2));
	ad2.getUser().addAll(Arrays.asList(reg1));
	
	userRegistrationRepository.saveAll(Arrays.asList(reg1, reg2));
	registrationAddressRepository.saveAll(Arrays.asList(ad1, ad2));
	
	
	
	
	}

}

package com.projetozup.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetozup.projeto.domain.UserRegistration;

@Repository 
public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Integer> {

}

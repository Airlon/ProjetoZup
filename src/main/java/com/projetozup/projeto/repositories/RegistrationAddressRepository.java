package com.projetozup.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetozup.projeto.domain.RegistrationAddress;

@Repository 
public interface RegistrationAddressRepository extends JpaRepository<RegistrationAddress, Integer> {

}

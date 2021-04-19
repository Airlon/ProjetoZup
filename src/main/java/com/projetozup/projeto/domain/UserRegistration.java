package com.projetozup.projeto.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "USER_REGISTRATION")
public class UserRegistration implements Serializable {
private static final long serialVersionUID = 1L;

      @Id
      @GeneratedValue(strategy=GenerationType.IDENTITY)
      private Integer id;
	  private String nome;
	  private String email;
	  private String dataNascimento;
	  private String CPF;
	  
	  //@JsonManagedReference
	  @ManyToMany(mappedBy="user")
	  private List<RegistrationAddress> address = new ArrayList<>();
	  
	  public UserRegistration() {
		  
	  }

	public UserRegistration(Integer id, String nome, String email, String dataNascimento, String CPF) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.CPF = CPF;
	
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	

	public List<RegistrationAddress> getAddress() {
		return address;
	}

	public void setAddress(List<RegistrationAddress> address) {
		this.address = address;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserRegistration other = (UserRegistration) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

}

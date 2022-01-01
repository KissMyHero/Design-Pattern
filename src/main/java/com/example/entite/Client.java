package com.example.entite;

import javax.persistence.Entity;

@Entity
public class Client extends BaseEntity{
	
	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}



}

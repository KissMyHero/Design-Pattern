package com.example.entite;

import javax.persistence.Entity;

@Entity
public class Produit extends BaseEntity{
	
	private String nom;
	
	private double prix;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Produit(String nom, double prix) {
		this.nom = nom;
		this.prix = prix;
	}

	public Produit() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}

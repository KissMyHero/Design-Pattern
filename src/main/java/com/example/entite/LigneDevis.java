package com.example.entite;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class LigneDevis extends BaseEntity{
	
	@OneToOne
	private Produit produit;
	
	private int qte;
	
	private double remise;
	
	private double montant;

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public double getRemise() {
		return remise;
	}

	public void setRemise(double remise) {
		this.remise = remise;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	

}

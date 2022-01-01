package com.example.entite;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Devis extends BaseEntity{
	
	@OneToOne
	private Client client;
	
	@OneToMany
	private List<LigneDevis> lignes;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<LigneDevis> getLignes() {
		return lignes;
	}

	public void setLignes(List<LigneDevis> lignes) {
		this.lignes = lignes;
	}
	
	

}

package com.example.service;

import java.util.List;

import com.example.entite.LigneDevis;
import com.example.entite.Produit;

public interface VenteService {
	
	List<Produit> getFilterProductOnPrice(List<Produit> list,double price);
	
	double calculMontant(LigneDevis ligne);

}

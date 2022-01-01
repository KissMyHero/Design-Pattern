package com.example.service;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.example.entite.LigneDevis;
import com.example.entite.Produit;

public class VenteServiceImpl implements VenteService{

	@Override
	public List<Produit> getFilterProductOnPrice(List<Produit> list, double price) {
		return list.stream().filter((p) -> p.getPrix()<price).collect(Collectors.toList());
	}

	@Override
	public double calculMontant(LigneDevis ligne) {
		ICalcul calcul=(prix,qte) -> prix*qte;
		
		return calcul.calcul(ligne.getProduit().getPrix(), ligne.getQte());
	}

}

package com.example.service;

import java.util.List;

import com.example.dto.ProduitDTO;
import com.example.entite.Produit;
import com.example.exception.ProduitNotFoundException;

public interface ProduitService {
	
	void create(ProduitDTO p) throws ProduitNotFoundException;
	
	List<Produit> findAll();
	
	List<Produit> findAllJPQL();
	
	Produit getProduitById(Long id);
	
	void update(ProduitDTO p);
	
	void remove(ProduitDTO p);

}

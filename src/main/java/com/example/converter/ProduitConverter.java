package com.example.converter;

import com.example.dto.ProduitDTO;
import com.example.entite.Produit;

public class ProduitConverter {
	
	public static ProduitDTO convertProduitEntityToProduitDto(Produit p) {
		ProduitDTO dto=new ProduitDTO();
		
		dto.setNom(p.getNom());
		dto.setPrix(p.getPrix());
		dto.setPrixTTC(0);
		return dto;
	}
	
	
	public static Produit convertDtoToProduit(ProduitDTO dto) {
		Produit p=new Produit();
		p.setNom(dto.getNom());
		p.setPrix(dto.getPrix());
		return p;
	}

}

package com.example.service;

public class ServicesFactory {
	
	public static VenteService getVenteService() {
		return new VenteServiceImpl();
	}
	
	public static ProduitService getProduitService() {
		return new ProduitServiceImpl();
	}

}

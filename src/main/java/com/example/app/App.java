package com.example.app;

import com.example.dto.ProduitDTO;
import com.example.entite.Produit;
import com.example.exception.ProduitNotFoundException;
import com.example.service.ProduitService;
import com.example.service.ServicesFactory;

import java.util.List;

public class App {

    public static void main(String[] args) {
        // VenteService vService = ServicesFactory.getVenteService();

        ProduitService pService = ServicesFactory.getProduitService();

        // VenteService vService=new VenteServiceImpl();

        for (int i = 0; i < 10; i++) {
            try {
                ProduitDTO p = new ProduitDTO();
                p.setNom("produit" + i);
                p.setPrix(10 + i);
                pService.create(p);
            } catch (ProduitNotFoundException e) {
                // Envoyer un message
                System.out.println("ERREUR PRODUIT NOT FOUND " + e.getMessage());
                // Logger.info

            }
        }


        List<Produit> listFromCriteria = pService.findAll();

        listFromCriteria.forEach((e) -> System.out.println(e.getNom()));

        List<Produit> listFromJPQL = pService.findAllJPQL();
        listFromJPQL.forEach((e) -> System.out.println(e.getNom()));

        Produit produitFromDB = pService.getProduitById(2L);

        System.out.println(produitFromDB.getNom());

    }
}

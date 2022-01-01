package com.example.service;

import java.util.Date;
import java.util.List;

import com.example.converter.IConverter;
import com.example.dao.DaoFactory;
import com.example.dao.IDao;
import com.example.dto.ProduitDTO;
import com.example.entite.Produit;
import com.example.exception.ProduitNotFoundException;

public class ProduitServiceImpl implements ProduitService {
	IConverter<Produit, ProduitDTO> converter;
	
	public ProduitServiceImpl() {
		
		converter = productDTO -> {
			Produit productEntity = new Produit();
			productEntity.setNom(productDTO.getNom());
			return productEntity;
		};
	}

	@Override
	public void create(ProduitDTO pDto) throws ProduitNotFoundException{
		if (pDto != null) {
			Produit entity = converter.convert(pDto);
			entity.setDateCreation(new Date());

			IDao<Produit> dao = DaoFactory.getDao();
			dao.create(entity);
		}else {
			throw new ProduitNotFoundException("product not found");
		}

	}

	@Override
	public List<Produit> findAll() {
		IDao<Produit> dao = DaoFactory.getDao();
		return dao.findAll(Produit.class );
	
	}

	@Override
	public Produit getProduitById(Long id) {
		IDao<Produit> dao = DaoFactory.getDao();
		
		return dao.findById(Produit.class, id);
	}

	@Override
	public void update(ProduitDTO p) {
		Produit produit=converter.convert(p);
		IDao<Produit> dao = DaoFactory.getDao();
		dao.update(produit);

	}

	@Override
	public void remove(ProduitDTO pDto) {
		Produit pEntity=converter.convert(pDto);
		IDao<Produit> dao=DaoFactory.getDao();
		dao.delete(pEntity);

	}

	@Override
	public List<Produit> findAllJPQL() {
		IDao<Produit> dao = DaoFactory.getDao();
		return dao.findAllFromJPQL(Produit.class);
	}

}

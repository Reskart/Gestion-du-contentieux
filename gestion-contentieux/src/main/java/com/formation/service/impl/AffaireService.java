package com.formation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.formation.entities.Affaire;
import com.formation.repositories.IAffaireRepository;
import com.formation.service.IAffaireService;

public class AffaireService implements IAffaireService {

	@Autowired
	public IAffaireRepository repo;
	
	@Override
	public Affaire getById(Long id) {
		return repo.getOne(id);
	}

	@Override
	public Affaire saveOrUpdate(Affaire a) {
		return repo.save(a);
	}

	@Override
	public List<Affaire> getAll() {
		repo.findAll();
		return null;
	}

}

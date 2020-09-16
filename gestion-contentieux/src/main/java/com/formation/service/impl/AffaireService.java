package com.formation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.entities.Affaire;
import com.formation.entities.Utilisateur;
import com.formation.repositories.IAffaireRepository;
import com.formation.service.IAffaireService;

@Service
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
	public void delete(Long id) {
		repo.deleteById(id);
		
	}
	public List<Affaire> getAll() {
		return repo.findAll();
	}

}

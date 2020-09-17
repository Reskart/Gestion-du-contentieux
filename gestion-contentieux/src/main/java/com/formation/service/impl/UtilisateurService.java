package com.formation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.entities.Utilisateur;
import com.formation.repositories.IUtilisateurRepository;
import com.formation.service.IUtilisateurService;

@Service
public class UtilisateurService implements IUtilisateurService {
	
	@Autowired
	private IUtilisateurRepository repo;

	@Override
	public Utilisateur saveOrUpdate(Utilisateur u) {
		return repo.save(u);
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public Utilisateur getById(Long id) {
		return repo.getOne(id);
	}

	@Override
	public List<Utilisateur> getAll() {
		return repo.findAll();
	}

	@Override
	public List<Utilisateur> findByName(String name) {

		return repo.findByNomUtilisateur(name);
	}
	
	

}

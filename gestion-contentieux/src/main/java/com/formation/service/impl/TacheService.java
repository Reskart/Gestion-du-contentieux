package com.formation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.entities.Tache;
import com.formation.repositories.ITacheRepository;
import com.formation.service.ITacheService;

@Service
public class TacheService implements ITacheService{
	
	@Autowired
	public ITacheRepository repo; 

	@Override
	public Tache saveOrUpdate(Tache t) {

		return repo.save(t);
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public Tache getById(Long id) {
		
		return repo.getOne(id);
	}

	@Override
	public List<Tache> getAll() {
		
		return repo.findAll();
	}

}

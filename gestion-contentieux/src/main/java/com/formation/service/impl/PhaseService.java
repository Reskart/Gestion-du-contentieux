package com.formation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.formation.entities.Phase;
import com.formation.repositories.IPhaseRepository;
import com.formation.service.IPhaseService;

public class PhaseService implements IPhaseService{
	
	@Autowired
	public IPhaseRepository repo;

	@Override
	public Phase saveOrUpdate(Phase p) {
		
		return repo.save(p);
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public Phase getById(Long id) {

		return repo.getOne(id);
	}

	@Override
	public List<Phase> getAll() {
		repo.findAll();
		return null;
	}

}

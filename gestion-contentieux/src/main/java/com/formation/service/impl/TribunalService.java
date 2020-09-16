package com.formation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.entities.Tribunal;
import com.formation.repositories.ITribunalRepository;
import com.formation.service.ITribunalService;

@Service
public class TribunalService implements ITribunalService{
	
	@Autowired
	public ITribunalRepository repo;

	@Override
	public Tribunal saveOrUpdate(Tribunal t) {
		
		return repo.save(t);
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public Tribunal getById(Long id) {

		return repo.getOne(id);
	}

	@Override
	public List<Tribunal> getAll() {
		
		return repo.findAll();
	}

}

package com.formation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.entities.Role;
import com.formation.repositories.IRoleRepository;
import com.formation.service.IRoleService;

@Service
public class RoleService implements IRoleService{
	
	@Autowired
	public IRoleRepository repo;

	@Override
	public Role saveOrUpdate(Role r) {
		
		return repo.save(r);
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public Role getById(Long id) {

		return repo.getOne(id);
	}

	@Override
	public List<Role> getAll() {
		repo.findAll();
		return repo.findAll();
	}

}

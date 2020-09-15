package com.formation.service;

import java.util.List;

import com.formation.entities.Role;

public interface IRoleService {
	
	public Role saveOrUpdate(Role r);
	public void delete(Long id);
	public Role getById(Long id);
	public List<Role> getAll();
	

}

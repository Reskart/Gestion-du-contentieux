package com.formation.service;

import java.util.List;

import com.formation.entities.Tache;



public interface ITacheService {
	
	public Tache saveOrUpdate(Tache t);
	public void delete(Long id);
	public Tache getById(Long id);
	public List<Tache> getAll();

}

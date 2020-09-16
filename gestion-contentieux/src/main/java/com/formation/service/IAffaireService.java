package com.formation.service;

import java.util.List;

import com.formation.entities.Affaire;

public interface IAffaireService {
	
	public Affaire getById(Long id);
	public Affaire saveOrUpdate(Affaire a);
	public List<Affaire> getAll();
	public void delete(Long id);

}

package com.formation.service;

import java.util.List;

import com.formation.entities.Utilisateur;



public interface IUtilisateurService {
	
	public Utilisateur saveOrUpdate(Utilisateur u);
	
	public void delete(Long id);
	
	public Utilisateur getById(Long id);
	
	public List<Utilisateur> getAll();
	

}

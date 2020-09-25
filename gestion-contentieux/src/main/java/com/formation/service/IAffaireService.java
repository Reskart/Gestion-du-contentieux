package com.formation.service;

import java.util.List;

import com.formation.entities.Affaire;
import com.formation.entities.Document;

public interface IAffaireService {
	
	public Affaire getById(Long id);
	public Affaire saveOrUpdate(Affaire a);
	public List<Affaire> getAll();
	public void delete(Long id);
	public Affaire findByRef(String ref);
	public List<Affaire> findByStatut(int statut);
	public List<Document> findDoc(Long id);

}

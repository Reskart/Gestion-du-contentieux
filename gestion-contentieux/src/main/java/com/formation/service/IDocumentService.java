package com.formation.service;

import java.util.List;

import com.formation.entities.Document;



public interface IDocumentService {

	public Document saveOrUpdate(Document d);
	public void delete(Long id);
	public Document getById(Long id);
	public List<Document> getAll();
}

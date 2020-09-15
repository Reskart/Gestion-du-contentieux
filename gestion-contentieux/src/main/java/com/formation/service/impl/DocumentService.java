package com.formation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.entities.Document;
import com.formation.repositories.IDocumentRepository;
import com.formation.service.IDocumentService;

@Service
public class DocumentService implements IDocumentService{

	@Autowired
	public IDocumentRepository repo;
	
	@Override
	public Document saveOrUpdate(Document d) {
		
		return repo.save(d);
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public Document getById(Long id) {

		return repo.getOne(id);
	}

	@Override
	public List<Document> getAll() {

		return repo.findAll();
	}

}

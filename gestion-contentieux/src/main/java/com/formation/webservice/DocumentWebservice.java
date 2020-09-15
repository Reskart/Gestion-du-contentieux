package com.formation.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.entities.Document;
import com.formation.service.IDocumentService;



@RestController
@RequestMapping("/apiDocument")
@CrossOrigin("*")
public class DocumentWebservice {

	@Autowired
	public IDocumentService service;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Document ajout(@RequestBody Document d) {
		return service.saveOrUpdate(d);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public Document update(@RequestBody Document d) {
		return service.saveOrUpdate(d);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
	@RequestMapping(value="/document/{id}", method=RequestMethod.GET)
	public Document getById(Long id) {
		return service.getById(id);
	}
	
	@RequestMapping(value="/documents", method=RequestMethod.GET)
	public List<Document> getAll(){
		return service.getAll();
	}
	
}
	


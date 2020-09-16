package com.formation.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.entities.Affaire;
import com.formation.service.IAffaireService;

@RestController
@RequestMapping("/apiAffaire")
@CrossOrigin("*")
public class AffaireWebservice {
	
	@Autowired
	public IAffaireService service;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Affaire ajout(@RequestBody Affaire a) {
		return service.saveOrUpdate(a);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Affaire update(@RequestBody Affaire a) {
		return service.saveOrUpdate(a);
	}
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	@RequestMapping(value = "/affaire/{id}", method = RequestMethod.GET)
	public Affaire recherche(@PathVariable Long id) {
		return service.getById(id);


	}
	@RequestMapping(value="affaires", method=RequestMethod.GET)
	public List<Affaire> getAll(){
		return service.getAll();

	}

}

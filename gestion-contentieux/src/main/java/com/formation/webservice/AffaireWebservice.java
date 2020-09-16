package com.formation.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Affaire ajout(@RequestBody Affaire a) {
		return service.saveOrUpdate(a);
	}
	
	@RequestMapping(value = "/affaires", method = RequestMethod.GET)
	public List<Affaire> consultation(@RequestBody Affaire a) {
		return service.getAll();
	}
	
	@RequestMapping(value = "/affaire/{id}", method = RequestMethod.GET)
	public Affaire recherche(@RequestBody Long idAffaire) {
		return service.getById(idAffaire);
	}
	

}

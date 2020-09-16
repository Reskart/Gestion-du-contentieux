package com.formation.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.entities.Utilisateur;
import com.formation.service.IUtilisateurService;

@RestController
@RequestMapping("/apiUtilisateur")
@CrossOrigin("*")
public class UtilisateurWebService {
	
	@Autowired
	public IUtilisateurService service;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Utilisateur ajout(@RequestBody Utilisateur u) {
		return service.saveOrUpdate(u);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public Utilisateur update(@RequestBody Utilisateur u) {
		return service.saveOrUpdate(u);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
	@RequestMapping(value="/utilisateur/{id}", method=RequestMethod.GET)
	public Utilisateur getById(@PathVariable Long id) {
		return service.getById(id);
	}
	
	@RequestMapping(value="utilisateurs", method=RequestMethod.GET)
	public List<Utilisateur> getAll(){
		return service.getAll();
	}

}

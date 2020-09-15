package com.formation.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.entities.Tache;
import com.formation.service.ITacheService;



@RestController
@RequestMapping("/apiTache")
@CrossOrigin("*")
public class TacheWebservice {
	
	@Autowired
	public ITacheService service;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Tache ajout(@RequestBody Tache t) {
		return service.saveOrUpdate(t);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public Tache update(@RequestBody Tache t) {
		return service.saveOrUpdate(t);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
	@RequestMapping(value="/role/{id}", method=RequestMethod.GET)
	public Tache getById(Long id) {
		return service.getById(id);
	}
	
	@RequestMapping(value="/roles", method=RequestMethod.GET)
	public List<Tache> getAll(){
		return service.getAll();
	}

}

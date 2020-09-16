package com.formation.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.entities.Tribunal;
import com.formation.service.ITribunalService;

@RestController
@RequestMapping("/apiTribunal")
@CrossOrigin("*")
public class TribunalWebservice {

	@Autowired
	public ITribunalService service;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Tribunal ajout(@RequestBody Tribunal t) {
		return service.saveOrUpdate(t);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public Tribunal update(@RequestBody Tribunal t) {
		return service.saveOrUpdate(t);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
	@RequestMapping(value="/tribunal/{id}", method=RequestMethod.GET)
	public Tribunal getById(@PathVariable Long id) {
		return service.getById(id);
	}
	
	@RequestMapping(value="/tribunaux", method=RequestMethod.GET)
	public List<Tribunal> getAll(){
		return service.getAll();
	}
	
}

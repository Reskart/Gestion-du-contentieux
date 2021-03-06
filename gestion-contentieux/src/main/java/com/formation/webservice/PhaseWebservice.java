package com.formation.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.entities.Phase;
import com.formation.service.IPhaseService;

@RestController
@RequestMapping("/apiPhase")
@CrossOrigin("*")
public class PhaseWebservice {

	@Autowired
	public IPhaseService service;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Phase ajout(@RequestBody Phase p) {
		return service.saveOrUpdate(p);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public Phase update(@RequestBody Phase p) {
		return service.saveOrUpdate(p);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
	@RequestMapping(value="/phase/{id}", method=RequestMethod.GET)
	public Phase getById(@PathVariable Long id) {
		return service.getById(id);
	}
	
	@RequestMapping(value="/phases", method=RequestMethod.GET)
	public List<Phase> getAll(){
		return service.getAll();
	}
	
}

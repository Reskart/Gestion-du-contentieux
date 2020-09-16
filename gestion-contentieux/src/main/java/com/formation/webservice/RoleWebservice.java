package com.formation.webservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.entities.Role;
import com.formation.entities.Utilisateur;
import com.formation.service.IRoleService;

@RestController
@RequestMapping("/apiRole")
@CrossOrigin("*")
public class RoleWebservice {

	@Autowired
	public IRoleService service;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Role ajout(@RequestBody Role r) {
		return service.saveOrUpdate(r);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public Role update(@RequestBody Role r) {
		return service.saveOrUpdate(r);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
	@RequestMapping(value="/role/{id}", method=RequestMethod.GET)
	public Role getById(@PathVariable Long id) {
		return service.getById(id);
	}
	
	@RequestMapping(value="/roles", method=RequestMethod.GET)
	public List<Role> getAll(){
		return service.getAll();
	}
	
	@RequestMapping(value="/utilisateurs/{id}", method=RequestMethod.GET)
	public List<Long> getIdUser(@PathVariable Long id) {
		List<Long> liste = new ArrayList<Long>();
		for (Utilisateur user : service.getById(id).getUtilisateurs())
		{
			liste.add(user.getIdUtilisateur());
		}
		return liste;
	}
	
}

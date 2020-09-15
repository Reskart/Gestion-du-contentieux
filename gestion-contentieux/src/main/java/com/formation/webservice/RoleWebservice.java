package com.formation.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.entities.Role;
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
	
	
	
}

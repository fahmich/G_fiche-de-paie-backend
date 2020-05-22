/**
 * 
 */
package com.fr.adaming.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.entity.AppRole;
import com.fr.adaming.entity.Manager;
import com.fr.adaming.entity.Profile;
import com.fr.adaming.service.ManagerService;
import com.fr.adaming.service.ProfileService;
import com.fr.adaming.service.RoleService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/Manager")
public class MangerController {
	
	@Autowired
	ProfileService profileService;
	@Autowired
	ManagerService managerService;
 	@Autowired
	RoleService roleService;
 

	@RequestMapping(value ="/createManager", method = RequestMethod.POST)
 	public HttpStatus save(@RequestBody Manager manager) {
		AppRole role = roleService.findByRoleName("ADMIN");	
		Collection<AppRole> roles = new ArrayList<AppRole>();
		roles.add(role); 

		Profile mg = profileService.saveProfil(
 		new Manager(manager.getNom(),manager.getPrenom(),
	 				manager.getCin() ,manager.getEmail(),
	 				manager.getTelephone(),manager.getAdresse(),manager.getImage(),
	 				manager.getUsername(), manager.getPassword(),
	 				manager.getDateDeNaissance(),roles));
        System.out.println(mg);
 		return HttpStatus.OK ;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public HttpStatus saveOrUpdate(@RequestBody Manager e) {
		managerService.saveOrUpdate(e);
		return HttpStatus.OK ;
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public HttpStatus delete(@PathVariable("id") Long id) {
		managerService.delete(id);
		return HttpStatus.OK ;
	}

	@RequestMapping(value = "/managers", method = RequestMethod.GET)
	public List<Manager> findAll() {
		return managerService.findAll();
	}

	@RequestMapping(value = "/manager/{id}", method = RequestMethod.GET)
	public Manager findOne(@PathVariable("id") Long id) {
		return managerService.findOne(id);
	}

}

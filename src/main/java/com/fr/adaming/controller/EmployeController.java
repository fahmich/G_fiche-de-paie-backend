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
import com.fr.adaming.entity.Employe;
import com.fr.adaming.entity.Profile;
import com.fr.adaming.service.EmployeService;
import com.fr.adaming.service.ProfileService;
import com.fr.adaming.service.RoleService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/Employe")
public class EmployeController {
	
	@Autowired
	ProfileService profileService;
	@Autowired
	private EmployeService employeService;
	@Autowired
	RoleService roleService;

	@RequestMapping(value = "/createEmploye", method = RequestMethod.POST)
	public Profile saveOrUpdate(@RequestBody Employe employe) {
		AppRole role = roleService.findByRoleName("USER");
		Collection<AppRole> roles = new ArrayList<AppRole>();
		roles.add(role);
		Profile emp = profileService.saveProfil(
				new Employe(employe.getNom(), employe.getPrenom(),
							employe.getCin(),employe.getEmail(), 
							employe.getTelephone(), employe.getAdresse(),employe.getImage(),
							employe.getUsername(),employe.getPassword(), 
							employe.getDateDeNaissance(), roles));
		
              System.out.println(emp);
		return employeService.findByUsername(employe.getUsername());
 	}
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public HttpStatus delete(@PathVariable("id") Long id) {
		employeService.delete(id);
		return HttpStatus.OK;
	}

	@RequestMapping(value = "/employes", method = RequestMethod.GET)
	public List<Employe> findAll() {
		return employeService.findAll();
	}

	@RequestMapping(value = "/employe/{id}", method = RequestMethod.GET)
	public Employe findOne(@PathVariable("id") Long id) {
		return employeService.findOne(id);
	}

}

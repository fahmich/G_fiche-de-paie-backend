package com.fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.entity.AppRole;
import com.fr.adaming.service.imp.RoleServiceImp;
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/Role")

public class RoleController {
	@Autowired
	private RoleServiceImp roleService;

	@RequestMapping(value = "roles", method = RequestMethod.GET)
	public List<AppRole> findAll() {
		return roleService.findAll();
	}
	@RequestMapping(value = "roles/{id}", method = RequestMethod.GET)
	public AppRole findOne(@PathVariable("id")Long idRole) {
		return roleService.findOne(idRole);
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void saveOrUpdate(@RequestBody AppRole role) {
		  roleService.saveOrUpdate(role);
	}
	@RequestMapping(value = "roles/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id")Long idRole) {
		roleService.delete(idRole);
	}
 
}

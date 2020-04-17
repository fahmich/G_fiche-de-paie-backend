package com.fr.adaming.service;

import java.util.List;

import com.fr.adaming.entity.AppRole;

public interface RoleService {
	public void saveOrUpdate(AppRole f);

	public void delete(Long id);

	public List<AppRole> findAll();

	public  AppRole findOne(Long id);
	
	public 	AppRole findByRoleName(String roleName);

 
}

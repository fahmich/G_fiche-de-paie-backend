package com.fr.adaming.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.entity.AppRole;
import com.fr.adaming.repository.RoleRepository;
import com.fr.adaming.service.RoleService;


@Service
public class RoleServiceImp implements RoleService {
	@Autowired
	private RoleRepository roleRepository;
 
	
	@Override
	public void saveOrUpdate(AppRole f) {
		roleRepository.save(f);
		
	} 
	@Override
	public void delete(Long id) {
		roleRepository.delete(id);	
	}
	@Override
	public AppRole findByRoleName(String roleName) {
 		return  roleRepository.findByRoleName(roleName);
	}
	public List<AppRole> findAll() {
		return roleRepository.findAll();
	}
	@Override
	public AppRole findOne(Long id) {
 		return roleRepository.findOne(id);
	}
	
	 
}

 package com.fr.adaming.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.entity.Manager;
import com.fr.adaming.repository.ManagerRepository;
import com.fr.adaming.service.ManagerService;
 
@Service
public class ManagerServiceImp implements ManagerService {
	@Autowired
	private ManagerRepository ManagerRepository;
	
	public void saveOrUpdate(Manager  a) {		 
	ManagerRepository.save(a);
	}

	public void delete(Long id) {
	ManagerRepository.delete(id);
	}

	public List<Manager> findAll() {
		return ManagerRepository.findAll();
	}

	public  Manager  findOne(Long id) {
		return ManagerRepository.findOne(id);
	}
 
 
  

}

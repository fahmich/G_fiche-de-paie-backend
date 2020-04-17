/**
 * 
 */
package com.fr.adaming.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.entity.Employe;
import com.fr.adaming.repository.EmployeRepository;
import com.fr.adaming.service.EmployeService;
 
@Service
public class EmployeServiceImp implements EmployeService {
	@Autowired
	private EmployeRepository employeRepository;
 

	public void saveOrUpdate(Employe e) {
    employeRepository.save(e);
	}

	public void delete(Long id) {
	employeRepository.delete(id);
	}

	public List<Employe> findAll() {
		return employeRepository.findAll();
	}

	public Employe findOne(Long id) {
		return employeRepository.findOne(id);
	}

 	public Employe findByUsername(String username) {	
 		return employeRepository.findByUsername(username);
	}
 
}

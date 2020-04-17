/**
 * 
 */
package com.fr.adaming.service;

import java.util.List;

import com.fr.adaming.entity.Employe;

/**
 * @author user
 *
 */
public interface EmployeService {
	public void saveOrUpdate(Employe e);

	public void delete(Long id);

	public List<Employe> findAll();

	public  Employe  findOne(Long id);
	
 
	public Employe findByUsername(String username);
 }

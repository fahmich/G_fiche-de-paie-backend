/**
 * 
 */
package com.fr.adaming.service;

import java.util.List;

import com.fr.adaming.entity.Manager;

 
public interface ManagerService {
	public void saveOrUpdate(Manager  a);

	public void delete(Long id);

	public List<Manager> findAll();

	public   Manager findOne(Long id);
}

/**
 * 
 */
package com.fr.adaming.service;

import java.util.List;

import com.fr.adaming.entity.Profile;

/**
 * @author user
 *
 */ 
public interface ProfileService {
 	
	public Profile saveProfil(Profile p);

	public void delete(Long id);

	public List<Profile> findAll();

	public  Profile  findOne(Long id);
	
	public Profile findUserByUserName(String username);

	

}

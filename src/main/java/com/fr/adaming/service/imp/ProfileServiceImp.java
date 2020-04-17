/**
 * 
 */
package com.fr.adaming.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.entity.Profile;
import com.fr.adaming.repository.ProfileRepository;
import com.fr.adaming.service.ProfileService;


@Service
public class ProfileServiceImp implements ProfileService {
	@Autowired
	private ProfileRepository profileRepository;

	@Override
	public Profile saveProfil(Profile p) {
		return profileRepository.save(p);
	}
	public void delete(Long id) {
		profileRepository.delete(id);
	}

	public List<Profile> findAll() {
		return profileRepository.findAll();
	}

	public Profile findOne(Long id) {
		return profileRepository.findOne(id);
	}
	@Override
	public Profile findUserByUserName(String username) {
		return profileRepository.findByUsername(username);
	}

}

 /**
 * 
 */
package com.fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.entity.Profile;
import com.fr.adaming.service.ProfileService;

 
@CrossOrigin("*")
@Transactional

@RestController
@RequestMapping(value = "/Profile")

public class ProfileController {
	@Autowired
	ProfileService profileService;
	
	 @RequestMapping(value = "/edit", method = RequestMethod.POST)
	 public HttpStatus edit(@RequestBody Profile profile) {
	
	 Profile p = profileService.findOne(profile.getIdProfile());
	
	 p.setPassword(profile.getPassword());
	 p.setEmail(profile.getEmail());
	 p.setNom(profile.getNom());
	 p.setPrenom(profile.getPrenom());
	 p.setAdresse(profile.getAdresse());
	 p.setCin(profile.getCin());
	 p.setTelephone(profile.getTelephone());
	 p.setDateDeNaissance(profile.getDateDeNaissance());
	
	 p.setUsername(profile.getUsername());
	
	 profileService.saveProfil(p);
	 return HttpStatus.OK ;
	 } 
 
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void save(@RequestBody Profile profile) {
	profileService.saveProfil(profile);
	}


	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		profileService.delete (id);
	}

	@RequestMapping(value = "/profiles", method = RequestMethod.GET)
	public List<Profile> findAll() {
		return profileService.findAll();
	}

	@RequestMapping(value = "/profile/{id}", method = RequestMethod.GET)
	public  Profile  findOne(@PathVariable("id") Long id) {
		return profileService.findOne(id);
	}
	
	
	@GetMapping("/username/{username}")
	public Profile getByUsername(@PathVariable("username") String username) {
		return profileService.findUserByUserName(username);
	}
 
}

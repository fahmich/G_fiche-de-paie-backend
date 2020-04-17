package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fr.adaming.repository.ProfileRepository;
import com.fr.adaming.repository.RoleRepository;
import com.fr.adaming.service.ProfileService;
import com.fr.adaming.service.RoleService;

@SpringBootApplication
public class GestionAdamingEmployeApplication implements CommandLineRunner {

	@Autowired
	ProfileRepository profileRepository;
 	@Autowired
 	RoleService roleService;
 
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	ProfileService profileService;
	
 
	public static void main(String[] args) {
		SpringApplication.run(GestionAdamingEmployeApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
 		
		 //test partie DAO : creation d'un employe, un compte et une opération
//		roleService.saveOrUpdate(new AppRole("ADMIN"));
//  	 roleService.saveOrUpdate(new AppRole("USER"));
//		Date date = new Date();
//		profileService.saveProfil(new Manager("fahmi","fahmi",123,"fahmi@fahmi.com",111,"tunis","Admin1", "1234",date,null));
//		Employe cli1 = (Employe) profileService.saveProfil(new Employe("Ahmed","Ahmed",123,"ahmed@ahmed.com",111,"tunis","Employe1", "1234",date,null));
//		Employe cli2 = (Employe)profileService.saveProfil(new Employe("aze","aze",456,"aze@aze.com",222,"france","Employe2", "1234",date,null));
//		
 		
	}
}
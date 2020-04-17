/**
 * 
 */
package com.fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.entity.Employe;
import com.fr.adaming.entity.FicheDePaie;
import com.fr.adaming.service.EmployeService;
import com.fr.adaming.service.FicheDePaieService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/FicheDePaie")
public class FicheDePaieController {
	@Autowired
	private FicheDePaieService ficheDePaieService;
	@Autowired
	private EmployeService employeService;
 
 
	
	@RequestMapping(value = "/create/{idProfile}", method = RequestMethod.POST)
 	public FicheDePaie save(@RequestBody FicheDePaie ficheDePaie,@PathVariable("idProfile") Long idProfile) {
 		
		Employe emp =  employeService.findOne(idProfile);
 		FicheDePaie file = ficheDePaieService.saveOrUpdate(new FicheDePaie(
 				ficheDePaie.getDateFiche(), 
 				ficheDePaie.getSalaireDeBase(), 
 				ficheDePaie.getPrime(), 
 				ficheDePaie.getImpotSurRevenu(), 
 				ficheDePaie.getHeuresTravaillees(),
 				ficheDePaie.getHeuresSupplementaires(), 
 				ficheDePaie.getCongeSansSolde(), emp));
 		
 		System.out.println("//11*******"+idProfile);
 		System.out.println("//22*****-----"+emp);
 		System.out.println("//33 ********"+file);
 		System.out.println(ficheDePaieService.findOne(file.getIdFicheDePaie()));

		return ficheDePaieService.findOne(file.getIdFicheDePaie());
 	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public HttpStatus edit(@RequestBody FicheDePaie ficheDePaie) {
		
		FicheDePaie file = ficheDePaieService.findOne(ficheDePaie.getIdFicheDePaie());
					file.setDateFiche(ficheDePaie.getDateFiche());
					file.setSalaireDeBase(ficheDePaie.getSalaireDeBase());
					file.setPrime(ficheDePaie.getPrime());  
					file.setImpotSurRevenu ( ficheDePaie.getImpotSurRevenu());
					file.setHeuresTravaillees(ficheDePaie.getHeuresTravaillees());
					file.setHeuresSupplementaires(ficheDePaie.getHeuresSupplementaires());  
					file.setCongeSansSolde(ficheDePaie.getCongeSansSolde());   

		System.out.println(ficheDePaieService.findOne(file.getIdFicheDePaie()));
			
		ficheDePaieService.saveOrUpdate(file);
	 return HttpStatus.OK ;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		ficheDePaieService.delete(id);
	}

	@RequestMapping(value = "/ficheDePaies", method = RequestMethod.GET)
	public List<FicheDePaie> findAll() {
		return ficheDePaieService.findAll();
	}

	
	@GetMapping("/fiche/{idProfile}")
	public List<FicheDePaie> findFicheDePaieById(@PathVariable("idProfile") Long idProfile) {
 	 
		Employe employe = employeService.findOne(idProfile);
		return ficheDePaieService.findByEmploye(employe);
	}
	
	@GetMapping("/ficheDePaies/{username}")
	public List<FicheDePaie> findFicheDePaieById(@PathVariable("username") String username) {
		Employe employe = employeService.findByUsername(username);
		return ficheDePaieService.findByEmploye(employe);
	}
 
}

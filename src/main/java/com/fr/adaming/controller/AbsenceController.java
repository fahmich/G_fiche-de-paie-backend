/**
 * 
 */
package com.fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.entity.Absence;
import com.fr.adaming.entity.FicheDePaie;
import com.fr.adaming.service.AbsenceService;
import com.fr.adaming.service.FicheDePaieService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/Absence")
public class AbsenceController {
	@Autowired
	private AbsenceService absenceService;
	@Autowired
	private FicheDePaieService ficheDePaieService;

	
	@RequestMapping(value = "/create/{idFicheDePaie}", method = RequestMethod.POST)
	public Absence save(@RequestBody Absence absence, @PathVariable("idFicheDePaie") Long idFicheDePaie) {
 		
		FicheDePaie file = ficheDePaieService.findOne(idFicheDePaie); 
		Absence abs = absenceService.saveOrUpdate(new Absence(
				absence.getDateDebut(),
				absence.getDuree(),
				absence.getRaison(), file));
		System.out.println(absenceService.findOne(abs.getIdAbsence()));
		
	return absenceService.findOne(abs.getIdAbsence());
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	 public HttpStatus edit(@RequestBody Absence absence) {	
		 
		Absence abs = absenceService.findOne(absence.getIdAbsence());
				 abs.setDateDebut(absence.getDateDebut());
				 abs.setDuree(absence.getDuree());
				 abs.setRaison(absence.getRaison());  
		 absenceService.saveOrUpdate(abs); 
		 System.out.println(absenceService.findOne(abs.getIdAbsence()));
 
	 return HttpStatus.OK ;
	 }
	

 
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deleteAbsence(@PathVariable("id") Long id) {
		absenceService.delete(id);
	}

	@RequestMapping(value = "/absences", method = RequestMethod.GET)
	public List<Absence> findAll() {
		return absenceService.findAll();
	}

	@RequestMapping(value = "/absences/{idFicheDePaie}", method = RequestMethod.GET)
	public List<Absence> findAbsenceById(@PathVariable("idFicheDePaie") Long idFicheDePaie) {
		
		FicheDePaie ficheDePaie = ficheDePaieService.findOne(idFicheDePaie);
		return absenceService.findByFicheDePaie(ficheDePaie);
 	}
}

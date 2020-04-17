/**
 * 
 */
package com.fr.adaming.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.entity.Absence;
import com.fr.adaming.entity.FicheDePaie;
import com.fr.adaming.repository.AbsenceRepository;
import com.fr.adaming.service.AbsenceService;
 

@Service
public class AbsenceServiceImp implements AbsenceService {
	@Autowired
	private AbsenceRepository absenceRepository;
 

	@Override
	public List<Absence> findAll() {
		return absenceRepository.findAll();
	}

	@Override
	public Absence findOne(Long idAbsence) {
		return absenceRepository.findOne(idAbsence);
	}

	@Override
	public Absence saveOrUpdate(Absence user) {
		return absenceRepository.save(user);
	}

	@Override
	public void delete(Long idAbsence) {
		absenceRepository.delete(idAbsence);
	}

	@Override
	public List<Absence> findByFicheDePaie(FicheDePaie ficheDePaie) {
 		return absenceRepository.findByFicheDePaie(ficheDePaie);
	}

	 
	}
 


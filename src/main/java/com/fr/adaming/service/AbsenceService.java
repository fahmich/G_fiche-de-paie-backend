/**
 * 
 */
package com.fr.adaming.service;

import java.util.List;

import com.fr.adaming.entity.Absence;
import com.fr.adaming.entity.FicheDePaie;

/**
 * @author user
 *
 */
public interface AbsenceService {
	public Absence saveOrUpdate(Absence a);

	public void delete(Long id);

	public List<Absence> findAll();

	public Absence findOne(Long idAbsence);

	public List<Absence> findByFicheDePaie(FicheDePaie ficheDePaie);

 }

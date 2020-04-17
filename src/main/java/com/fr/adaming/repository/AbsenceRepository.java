/**
 * 
 */
package com.fr.adaming.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fr.adaming.entity.Absence;
import com.fr.adaming.entity.FicheDePaie;


public interface AbsenceRepository extends JpaRepository<Absence, Long> {
	public List<Absence> findByFicheDePaie(FicheDePaie ficheDePaie);

}

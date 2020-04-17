/**
 * 
 */
package com.fr.adaming.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
  
import com.fr.adaming.entity.Employe;
 import com.fr.adaming.entity.FicheDePaie;

/**
 * @author user
 * d
 */
public interface FicheDePaieRepository extends JpaRepository<FicheDePaie, Long> {
	
	public List<FicheDePaie> findByEmploye(Employe employe);
 
}

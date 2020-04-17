/**
 * 
 */
package com.fr.adaming.service;

import java.util.List;

import com.fr.adaming.entity.Employe;
import com.fr.adaming.entity.FicheDePaie;

/**
 * @author user
 *
 */
public interface FicheDePaieService {
	
	public FicheDePaie saveOrUpdate(FicheDePaie f);

	public void delete(Long id);

	public List<FicheDePaie> findAll();

	public  FicheDePaie  findOne(Long id);

	public List<FicheDePaie> findByEmploye(Employe employe);

}

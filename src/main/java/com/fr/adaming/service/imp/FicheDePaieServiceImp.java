/**
 * 
 */
package com.fr.adaming.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.entity.Employe;
import com.fr.adaming.entity.FicheDePaie;
import com.fr.adaming.repository.FicheDePaieRepository;
import com.fr.adaming.service.FicheDePaieService;


@Service
public class FicheDePaieServiceImp implements FicheDePaieService {
	@Autowired
	private FicheDePaieRepository ficheDePaieRepository;
 
	@Override
	public FicheDePaie saveOrUpdate(FicheDePaie f) {
		return ficheDePaieRepository.save(f);	
	}
	@Override
	public void delete(Long id) {
	ficheDePaieRepository.delete(id);	
	}
	@Override
	public List<FicheDePaie> findAll() {
		return ficheDePaieRepository.findAll();
	}
	@Override
	public FicheDePaie findOne(Long id) {
		return ficheDePaieRepository.findOne(id);
 	}
	
	@Override
	public List<FicheDePaie> findByEmploye(Employe employe ) {
 		return 	 ficheDePaieRepository.findByEmploye(employe);

	}
	 
}

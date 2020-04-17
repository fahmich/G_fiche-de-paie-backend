///**
// * 
// */
//package com.fr.adaming.service.imp;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.fr.adaming.entity.Employe;
//import com.fr.adaming.entity.Reclamation;
//import com.fr.adaming.repository.EmployeRepository;
//import com.fr.adaming.repository.ReclamationRepository;
//import com.fr.adaming.service.ReclamationService;
//
///**
// * @author user
// *
// */
//@Service
//public class ReclamationServiceImp implements ReclamationService {
//	@Autowired
//	private ReclamationRepository reclamationRepository;
//
//	@Autowired
//	private EmployeRepository employeRepository;
//
//	public void saveOrUpdate(Employe e) {
//		reclamationRepository.save(e);
//	}
//
//	public void delete(Long id) {
//		reclamationRepository.delete(id);
//	}
//
//	public List<Employe> findAll() {
//		return reclamationRepository.findAll();
//	}
//
//	public Employe findOne(Long id) {
//		return reclamationRepository.findOne(id);
//	}
//
//}

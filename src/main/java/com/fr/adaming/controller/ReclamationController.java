 //package com.fr.adaming.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.fr.adaming.entity.Reclamation;
//import com.fr.adaming.service.ReclamationService;
//
///**
// * @author user
// *
// */
//@CrossOrigin("*")
//@RestController
//@RequestMapping(value = "/Reclamation")
//public class ReclamationController {
//	@Autowired
//	private ReclamationService reclamationService;
//
//	@RequestMapping(value = "/add", method = RequestMethod.POST)
//	public void saveOrUpdateReclamation(@RequestBody Reclamation r) {
//		reclamationService.saveOrUpdate(r);
//	}
//
//	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
//	public void deleteReclamation(@PathVariable("id") Long id) {
//		reclamationService.delete(id);
//	}
//
//	@RequestMapping(value = "/reclamations", method = RequestMethod.GET)
//	public List<Reclamation> findAll() {
//		return reclamationService.findAll();
//	}
//
//	@RequestMapping(value = "/reclamation/{id}", method = RequestMethod.GET)
//	public Reclamation  findReclamationById(@PathVariable("id") Long id) {
//		return reclamationService.findROne(id);
//	}
//}

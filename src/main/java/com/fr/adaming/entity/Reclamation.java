//package com.fr.adaming.entity;
//
//import java.io.Serializable;
//import java.util.Date;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
// 
//@Entity
//public class Reclamation implements Serializable {
//	/**
//		 * 
//		 */
//	private static final long serialVersionUID = -1328164667043020559L;
//	@Id
//	private Long idReclamation;
// 	private String message;
// 	private Date date;
// 	
// 	@ManyToOne
//	@JoinColumn(name="CODE_EMPLOYE")
//	private Employe employe;
//
// 	
//	public Reclamation(Long idReclamation, String message, Date date, Employe employe) {
//		super();
//		this.idReclamation = idReclamation;
//		this.message = message;
//		this.date = date;
//		this.employe = employe;
//	}
//
//	public Reclamation() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Reclamation(String message, Date date, Employe employe) {
//		super();
//		this.message = message;
//		this.date = date;
//		this.employe = employe;
//	}
//
//	public Long getIdReclamation() {
//		return idReclamation;
//	}
//
//	public void setIdReclamation(Long idReclamation) {
//		this.idReclamation = idReclamation;
//	}
//
//	public String getMessage() {
//		return message;
//	}
//
//	public void setMessage(String message) {
//		this.message = message;
//	}
//
//	public Date getDate() {
//		return date;
//	}
//
//	public void setDate(Date date) {
//		this.date = date;
//	}
//
//	public Employe getEmploye() {
//		return employe;
//	}
//
//	public void setEmploye(Employe employe) {
//		this.employe = employe;
//	}
//
//	 
//}

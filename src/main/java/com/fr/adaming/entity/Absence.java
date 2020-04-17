package com.fr.adaming.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Absence implements Serializable{
	 
	private static final long serialVersionUID = -3842833634147092745L;
	@Id @GeneratedValue
	private Long idAbsence;
	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dateDebut;
  	private Integer duree;
	private String raison;
	
 	
	@ManyToOne
	@JoinColumn(name="CODE_FICHE_DE_PAIE")
	@JsonIgnore
	private FicheDePaie ficheDePaie;


	public Absence(Date dateDebut, Integer duree, String raison, FicheDePaie ficheDePaie) {
		super();
		this.dateDebut = dateDebut;
		this.duree = duree;
		this.raison = raison;
		this.ficheDePaie = ficheDePaie;
	}


	public Absence(Long idAbsence, Date dateDebut, Integer duree, String raison) {
		super();
		this.idAbsence = idAbsence;
		this.dateDebut = dateDebut;
		this.duree = duree;
		this.raison = raison;
	}


	public Absence() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getIdAbsence() {
		return idAbsence;
	}


	public void setIdAbsence(Long idAbsence) {
		this.idAbsence = idAbsence;
	}


	public Date getDateDebut() {
		return dateDebut;
	}


	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}


	public Integer getDuree() {
		return duree;
	}


	public void setDuree(Integer duree) {
		this.duree = duree;
	}


	public String getRaison() {
		return raison;
	}


	public void setRaison(String raison) {
		this.raison = raison;
	}


	public FicheDePaie getFicheDePaie() {
		return ficheDePaie;
	}


	public void setFicheDePaie(FicheDePaie ficheDePaie) {
		this.ficheDePaie = ficheDePaie;
	}
 
	 
	
}

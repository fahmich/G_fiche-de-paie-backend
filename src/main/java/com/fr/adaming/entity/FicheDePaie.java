package com.fr.adaming.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
 public class FicheDePaie implements Serializable{

	private static final long serialVersionUID = 242061005457400187L;
	@Id
	@GeneratedValue
	private Long idFicheDePaie;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dateFiche; 
	private Float salaireDeBase;
	private Float prime;
  	private Float ImpotSurRevenu;
  	
 	private Integer heuresTravaillees;
 	private Integer heuresSupplementaires;
 	private Integer congeSansSolde;
 	
//  -----------------------
	@ManyToOne
	@JoinColumn(name="CODE_EMPLOYE" )
	private Employe employe;
	
	@OneToMany(mappedBy="ficheDePaie",cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,CascadeType.REMOVE} )
 	private Collection<Absence> Absences = new ArrayList<>();

	//@JsonIgnore
	public Employe getEmploye() {
		return employe;
	}
	
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	@JsonIgnore
	public Collection<Absence> getAbsences() {
		return Absences;
	}

	public void setAbsences(Collection<Absence> absences) {
		Absences = absences;
	}
//	-----------------------

	public Long getIdFicheDePaie() {
		return idFicheDePaie;
	}

	public Date getDateFiche() {
		return dateFiche;
	}

	public void setDateFiche(Date dateFiche) {
		this.dateFiche = dateFiche;
	}

	public void setIdFicheDePaie(Long idFicheDePaie) {
		this.idFicheDePaie = idFicheDePaie;
	}

	public Float getSalaireDeBase() {
		return salaireDeBase;
	}

	public void setSalaireDeBase(Float salaireDeBase) {
		this.salaireDeBase = salaireDeBase;
	}

	public Float getPrime() {
		return prime;
	}

	public void setPrime(Float prime) {
		this.prime = prime;
	}

	public Float getImpotSurRevenu() {
		return ImpotSurRevenu;
	}

	public void setImpotSurRevenu(Float impotSurRevenu) {
		ImpotSurRevenu = impotSurRevenu;
	}

	public Integer getHeuresTravaillees() {
		return heuresTravaillees;
	}

	public void setHeuresTravaillees(Integer heuresTravaillees) {
		this.heuresTravaillees = heuresTravaillees;
	}

	public Integer getHeuresSupplementaires() {
		return heuresSupplementaires;
	}

	public void setHeuresSupplementaires(Integer heuresSupplementaires) {
		this.heuresSupplementaires = heuresSupplementaires;
	}

	public Integer getCongeSansSolde() {
		return congeSansSolde;
	}

	public void setCongeSansSolde(Integer congeSansSolde) {
		this.congeSansSolde = congeSansSolde;
	}

	public FicheDePaie() {
	 
	}

//	public FicheDePaie(Long idFicheDePaie, Date dateFiche, Float salaireDeBase, Float prime, Float impotSurRevenu,
//			Integer heuresTravaillees, Integer heuresSupplementaires, Integer congeSansSolde, Employe employe,
//			Collection<Absence> absences) {
//		super();
//		this.idFicheDePaie = idFicheDePaie;
//		this.dateFiche = dateFiche;
//		this.salaireDeBase = salaireDeBase;
//		this.prime = prime;
//		ImpotSurRevenu = impotSurRevenu;
//		this.heuresTravaillees = heuresTravaillees;
//		this.heuresSupplementaires = heuresSupplementaires;
//		this.congeSansSolde = congeSansSolde;
//		this.employe = employe;
//		Absences = absences;
//	}

	public FicheDePaie(Date dateFiche, Float salaireDeBase, Float prime, Float impotSurRevenu,
			Integer heuresTravaillees, Integer heuresSupplementaires, Integer congeSansSolde, Employe employe) {
		super();
		this.dateFiche = dateFiche;
		this.salaireDeBase = salaireDeBase;
		this.prime = prime;
		ImpotSurRevenu = impotSurRevenu;
		this.heuresTravaillees = heuresTravaillees;
		this.heuresSupplementaires = heuresSupplementaires;
		this.congeSansSolde = congeSansSolde;
		this.employe = employe;
	}

	@Override
	public String toString() {
		return "FicheDePaie [idFicheDePaie=" + idFicheDePaie + ", dateFiche=" + dateFiche + ", salaireDeBase="
				+ salaireDeBase + ", prime=" + prime + ", ImpotSurRevenu=" + ImpotSurRevenu + ", heuresTravaillees="
				+ heuresTravaillees + ", heuresSupplementaires=" + heuresSupplementaires + ", congeSansSolde="
				+ congeSansSolde + ", employe=" + employe + ", Absences=" + Absences + "]";
	}
 
	 

 
 

	
 
}

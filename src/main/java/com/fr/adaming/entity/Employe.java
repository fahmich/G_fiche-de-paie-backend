package com.fr.adaming.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@DiscriminatorValue("E")
public class Employe extends Profile{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5156341083670110452L;
	
	@OneToMany(mappedBy="employe", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,CascadeType.REMOVE})
	private Collection<FicheDePaie> FicheDePaies = new ArrayList<>();
 
//	@OneToMany(mappedBy="employe")
//	private Collection<Reclamation> Reclamations = new ArrayList<>();


 
	public Employe() {
		super();
 	}

 
 
	public Employe( String nom, String prenom, Integer cin, String email, Integer telephone, String adresse, 
			String username, String password, Date dateDeNaissance, Collection<AppRole> roles) {
		
		super( nom, prenom, cin, email, telephone, adresse , username, password, dateDeNaissance, roles);
		// TODO Auto-generated constructor stub
	}
	
	@JsonIgnore
	public Collection<FicheDePaie> getFicheDePaies() {
		return FicheDePaies;
	}

	public void setFicheDePaies(Collection<FicheDePaie> ficheDePaies) {
		FicheDePaies = ficheDePaies;
	}


	@Override
	public String toString() {
		return "Employe [idProfile=" + idProfile + ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", email="
				+ email + ", telephone=" + telephone + ", adresse=" + adresse + ", username=" + username + ", password="
				+ password + ", dateDeNaissance=" + dateDeNaissance + ", roles=" + roles + "]";
	}


	 

 
}

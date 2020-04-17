package com.fr.adaming.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class Manager extends Profile {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6706585928064048252L;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

 
	public Manager( String nom, String prenom, Integer cin, String email, Integer telephone, String adresse, 
			String username, String password, Date dateDeNaissance, Collection<AppRole> roles) {
		super( nom, prenom, cin, email, telephone, adresse, username, password, dateDeNaissance, roles);
		// TODO Auto-generated constructor stub
	}
 

 


	
}

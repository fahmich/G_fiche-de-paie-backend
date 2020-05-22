package com.fr.adaming.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
 
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE", discriminatorType = DiscriminatorType.STRING, length = 1)
public class Profile implements Serializable {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1904501131508403342L;
	@Id
	@GeneratedValue
	protected Long idProfile;
	protected String nom;
	protected String prenom;
	protected Integer cin;
	protected String image;

	protected String email;
	protected Integer telephone;
	protected String adresse;
	
 
	@Column(unique = true)
	protected String username;
	protected String password;
	
 	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	protected Date dateDeNaissance;
 
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}) 
 
	@JoinTable(name="profile_roles", joinColumns=@JoinColumn(name="idProfile"), inverseJoinColumns=@JoinColumn(name="id"))
	protected Collection<AppRole> roles;

	public Profile() {
		 
	}
 

	
	public Profile(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Profile(String username, String password, Collection<AppRole> roles) {
		super();
		this.username = username;
		this.password = password;
		this.roles = roles;
	}
	public Profile(String nom, String prenom, Integer cin, String email, Integer telephone, String adresse,String image,
	String username, String password, Date dateDeNaissance, Collection<AppRole> roles) {
			this.nom = nom;
			this.prenom = prenom;
			this.cin = cin;
			this.email = email;
			this.telephone = telephone;
			this.adresse = adresse;
			this.username = username;
			this.password = password;
			this.dateDeNaissance = dateDeNaissance;
			this.roles = roles;
			this.image = image;

			}
	
 

	public Long getIdProfile() {
		return idProfile;
	}

	public void setIdProfile(Long idProfile) {
		this.idProfile = idProfile;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Integer getCin() {
		return cin;
	}

	public void setCin(Integer cin) {
		this.cin = cin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelephone() {
		return telephone;
	}

	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public Collection<AppRole> getRoles() {
		return roles;
	}

	public void setRoles(Collection<AppRole> roles) {
		this.roles = roles;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	@Override
	public String toString() {
		return "Profile [idProfile=" + idProfile + ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", image="
				+ image + ", email=" + email + ", telephone=" + telephone + ", adresse=" + adresse + ", username="
				+ username + ", password=" + password + ", dateDeNaissance=" + dateDeNaissance + ", roles=" + roles
				+ "]";
	}

	 

}

package com.fr.adaming.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity
public class AppRole implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1125101145359276211L;
	@Id  @GeneratedValue
	private Long id;
	@Column(unique=true)
	private String roleName;
	

	public AppRole() { 
		super();
	}
	public AppRole(String roleName) {
		super();
		this.roleName = roleName;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long idRole) {
		this.id = idRole;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Override
	public String toString() {
		return "AppRole [id=" + id + ", roleName=" + roleName + "]";
	}

}

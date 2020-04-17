/**
 * 
 */
package com.fr.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fr.adaming.entity.Employe;

/**
 * @author user
 *
 */
public interface EmployeRepository extends JpaRepository<Employe, Long> {
	
	public Employe findByUsername(String username);
 

}

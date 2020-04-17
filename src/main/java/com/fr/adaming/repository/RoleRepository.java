/**
 * 
 */
package com.fr.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fr.adaming.entity.AppRole;
 
public interface RoleRepository extends JpaRepository<AppRole, Long> {
	AppRole findByRoleName(String roleName);

}

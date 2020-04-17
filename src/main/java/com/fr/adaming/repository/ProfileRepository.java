/**
 * 
 */
package com.fr.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fr.adaming.entity.Profile;
 
public interface ProfileRepository extends JpaRepository<Profile, Long> {
	public Profile findByUsername(String username);

}

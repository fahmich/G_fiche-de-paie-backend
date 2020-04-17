package com.fr.adaming.sec;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fr.adaming.entity.Profile;
import com.fr.adaming.service.ProfileService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private ProfileService profileService;
	
	// cette méthode permet de récupérer le profil depuis la base 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// on récupère le profil
		Profile profil = profileService.findUserByUserName(username);

		if(profil == null) throw new UsernameNotFoundException("Username introuvable");
		// on crée une collection de GranteAuhtority et on la remplit avec les roles de mon profil
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		profil.getRoles().forEach(r->{
			authorities.add(new SimpleGrantedAuthority(r.getRoleName()));
		});
		// on instancie et on retourne l'objet User de spring
		return new User(profil.getUsername(), profil.getPassword(), authorities);
	}

}

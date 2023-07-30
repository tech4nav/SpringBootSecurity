package com.nav.securityLayerJWT.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nav.securityLayerJWT.models.User;
import com.nav.securityLayerJWT.persistence.IUserRepository;

import lombok.RequiredArgsConstructor;


@Service
public class CustomerUserDetailsService implements UserDetailsService {

	@Autowired
	public IUserRepository iUserRepository ;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = iUserRepository.findByEmail(email).orElseThrow(()-> new UsernameNotFoundException("User not found !"));
        return  user ;

    }


}

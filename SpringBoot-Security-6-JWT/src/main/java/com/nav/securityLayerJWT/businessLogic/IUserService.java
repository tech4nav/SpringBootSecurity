package com.nav.securityLayerJWT.businessLogic;


import org.springframework.http.ResponseEntity;

import com.nav.securityLayerJWT.dto.LoginDto;
import com.nav.securityLayerJWT.dto.RegisterDto;
import com.nav.securityLayerJWT.models.Role;
import com.nav.securityLayerJWT.models.User;


public interface IUserService {
   //ResponseEntity<?> register (RegisterDto registerDto);
 //  ResponseEntity<BearerToken> authenticate(LoginDto loginDto);

   String authenticate(LoginDto loginDto);
   ResponseEntity<?> register (RegisterDto registerDto);
   Role saveRole(Role role);

   User saveUser (User user) ;
}

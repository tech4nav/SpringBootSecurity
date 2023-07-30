package com.nav.securityLayerJWT.presentation;


import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nav.securityLayerJWT.businessLogic.IUserService;
import com.nav.securityLayerJWT.dto.LoginDto;
import com.nav.securityLayerJWT.dto.RegisterDto;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserRestController {


    private final IUserService iUserService ;

    //RessourceEndPoint:http://localhost:8087/api/user/register
    @PostMapping("/register")
    public ResponseEntity<?> register (@RequestBody RegisterDto registerDto)
    { return  iUserService.register(registerDto);}

    //RessourceEndPoint:http://localhost:8087/api/user/authenticate
    @PostMapping("/authenticate")
    public String authenticate(@RequestBody LoginDto loginDto)
    { return  iUserService.authenticate(loginDto);}



}

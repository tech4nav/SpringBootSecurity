package com.nav.securityLayerJWT;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.nav.securityLayerJWT.businessLogic.IUserService;
import com.nav.securityLayerJWT.models.Role;
import com.nav.securityLayerJWT.models.RoleName;
import com.nav.securityLayerJWT.models.User;
import com.nav.securityLayerJWT.persistence.IRoleRepository;
import com.nav.securityLayerJWT.persistence.IUserRepository;

@SpringBootApplication
public class SecurityLayerJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityLayerJwtApplication.class, args);
    }



    @Bean
    CommandLineRunner run (IUserService iUserService , IRoleRepository iRoleRepository , IUserRepository iUserRepository , PasswordEncoder passwordEncoder)
    {return  args ->
    {   iUserService.saveRole(new Role(RoleName.USER));
        iUserService.saveRole(new Role(RoleName.ADMIN));
        iUserService.saveRole(new Role(RoleName.SUPERADMIN));
        iUserService.saveUser(new User("admin@abc.com", passwordEncoder.encode("adminPassword"), new ArrayList<>()));
        iUserService.saveUser(new User("superadminadmin@abc.com", passwordEncoder.encode("superadminPassword"), new ArrayList<>()));

        Role role = iRoleRepository.findByRoleName(RoleName.ADMIN);
        User user = iUserRepository.findByEmail("admin@abc.com").orElse(null);
        user.getRoles().add(role);
        iUserService.saveUser(user);

        User user1 = iUserRepository.findByEmail("superadminadmin@abc.com").orElse(null);
        Role role1 = iRoleRepository.findByRoleName(RoleName.SUPERADMIN);
        user1.getRoles().add(role1);
        iUserService.saveUser(user1);

    };}

}


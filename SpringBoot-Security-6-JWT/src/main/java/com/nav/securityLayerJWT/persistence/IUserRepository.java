package com.nav.securityLayerJWT.persistence;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.nav.securityLayerJWT.models.User;

public interface IUserRepository extends CrudRepository<User,Integer> {

    Boolean existsByEmail(String email);
    Optional<User> findByEmail(String email);


}



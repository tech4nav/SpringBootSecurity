package com.nav.securityLayerJWT.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.nav.securityLayerJWT.models.Role;
import com.nav.securityLayerJWT.models.RoleName;

public interface IRoleRepository extends CrudRepository<Role,Integer> {

    Role findByRoleName(RoleName roleName);


}

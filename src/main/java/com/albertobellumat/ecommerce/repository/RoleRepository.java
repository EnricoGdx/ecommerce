package com.albertobellumat.ecommerce.repository;

import com.albertobellumat.ecommerce.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByname(String name);
}
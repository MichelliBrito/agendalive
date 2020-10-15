package com.spring.agendalive.repository;

import com.spring.agendalive.document.ERole;
import com.spring.agendalive.document.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}

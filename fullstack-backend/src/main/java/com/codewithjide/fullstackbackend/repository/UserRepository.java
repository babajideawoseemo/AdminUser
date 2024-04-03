package com.codewithjide.fullstackbackend.repository;

import com.codewithjide.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}

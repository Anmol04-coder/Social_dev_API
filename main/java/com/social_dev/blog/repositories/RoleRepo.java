package com.social_dev.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social_dev.blog.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{

}

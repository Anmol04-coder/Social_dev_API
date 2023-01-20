package com.social_dev.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social_dev.blog.entities.Category;


public interface CategoryRepo extends JpaRepository<Category,Integer>{
	
	
	
}

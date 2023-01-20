package com.social_dev.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social_dev.blog.entities.Category;
import com.social_dev.blog.entities.Post;
import com.social_dev.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{

	List<Post> findByuser(User user);
	List<Post> findByCategory(Category category);
	
	List<Post> findByTitleContaining(String tile);
	
}

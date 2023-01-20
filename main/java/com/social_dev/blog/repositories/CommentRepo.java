package com.social_dev.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social_dev.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}

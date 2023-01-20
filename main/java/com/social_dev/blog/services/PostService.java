package com.social_dev.blog.services;

import java.util.List;

import com.social_dev.blog.entities.Post;
import com.social_dev.blog.payloads.PostDto;
import com.social_dev.blog.payloads.PostResponse;

public interface PostService {

	
	//create 
	PostDto createPost(PostDto post, Integer userId, Integer categoryId);
	
	//update 
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//getAllPost
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy);
	
	//getPost
	PostDto GetpostById(Integer postId);
	
	//get All Post by category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get All Posts by user
	List<PostDto> getPostsByUser(Integer userId);
	
	//search Posts
	List<PostDto> searchPosts(String keyword);
	
}

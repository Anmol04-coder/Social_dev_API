package com.social_dev.blog.payloads;

import java.util.*;

import com.social_dev.blog.entities.Comment;

//import com.social_dev.blog.entities.Category;
//import com.social_dev.blog.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//import com.social_dev.blog.entities.Post;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
	private Integer postId;

	private String title;
	
	private String content;

	private String imageName;

	private Date addedDate;

	private CategoryDto category;

	private UserDto user;
	
	private Set<CommentDto> comments = new HashSet<>();

}

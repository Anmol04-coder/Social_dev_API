package com.social_dev.blog.services;

import com.social_dev.blog.payloads.CommentDto;

public interface CommentService {
	
	CommentDto createComment(CommentDto commentDto, Integer postId);
	
	void deleteComment(Integer CommentId);
	
}

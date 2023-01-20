package com.social_dev.blog.payloads;

import lombok.Data;

@Data
public class jwtAuthRequest {
	private String username;
	private String password;
}

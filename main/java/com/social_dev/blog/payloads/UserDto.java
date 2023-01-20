package com.social_dev.blog.payloads;


import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.social_dev.blog.entities.Role;

/*
 * used to transfer the data;
 */

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int id;
	
	@NotEmpty
	@Size(min = 4, message = "username must be min of u character !")
	private String name;
	
	@Email(message="Email address is not valid !")
	private String email;
	
	@NotEmpty
	@Size(min=3,max=20,message="Password must be min of 3 chars and max of 20 char")
	private String password;
	
	@NotEmpty
	private String about;
	
	private Set<CommentDto> comments = new HashSet<>();

	
	private Set<RoleDto> roles = new HashSet<>();
}

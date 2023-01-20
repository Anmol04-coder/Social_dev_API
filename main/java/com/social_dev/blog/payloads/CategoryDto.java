package com.social_dev.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	
	
	private Integer categoryId;
	
	@NotBlank
	@Size(min=4, message="Min size Of category title is 4")
	private String CategoryTitle;
	
	@NotBlank
	@Size(min=10, message="min size of category desc is 10")
	private String categoryDescription;
}

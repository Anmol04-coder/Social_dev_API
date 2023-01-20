package com.social_dev.blog.services;

import java.io.*;

import org.springframework.web.multipart.MultipartFile;



public interface FileService {
	
	String uploadImage(String path, MultipartFile file) throws IOException;
	InputStream getResource(String path, String fileName) throws FileNotFoundException;
	
}

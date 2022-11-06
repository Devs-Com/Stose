package com.example.stose.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Blogs")
public class BlogDTO {
	
	@Id
	private String _id;
	
	private String name;

	
}

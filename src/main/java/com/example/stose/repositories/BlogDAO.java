package com.example.stose.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.stose.models.BlogDTO;

@Repository
public interface BlogDAO extends MongoRepository<BlogDTO, String> {
	
	
}

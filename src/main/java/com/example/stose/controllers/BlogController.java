package com.example.stose.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.stose.models.BlogDTO;
import com.example.stose.repositories.BlogDAO;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/blogs")
public class BlogController {

	@Autowired
	private BlogDAO repository;

	@PostMapping("/blogs")
	public BlogDTO create(@Validated @RequestBody BlogDTO p) {
		return repository.insert(p);
	}

	@GetMapping("/")
	public List<BlogDTO> readAll() {
		return repository.findAll();
	}

	@PutMapping("/blogs/{id}")
	public BlogDTO update(@PathVariable String id, @Validated @RequestBody BlogDTO p) {
		return repository.save(p);
	}

	@DeleteMapping("/blogs/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
	
}

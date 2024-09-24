package com.matera.blog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matera.blog.model.Funcionario;
import com.matera.blog.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
	
	public List<Funcionario> findAll() {
		return repository.findAll(); 
	}
	
	public Optional<Funcionario> findOne(Long id) {
		return repository.findById(id);
	}
	
	public Funcionario save(Funcionario post) {
		return repository.saveAndFlush(post);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
}

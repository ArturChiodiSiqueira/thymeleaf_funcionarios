package com.matera.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matera.blog.model.Funcionario;

@Repository
public interface PostRepository extends JpaRepository<Funcionario, Long> { } 

package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostagemRepository extends JpaRepository<PostagemModel, Long>{
	
	public List<PostagemModel> findAllByTituloContainingIgnoreCase(String titulo);

	

}

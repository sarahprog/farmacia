package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{ //herança
	
	public List <Categoria> findAllByNomeContainingIgnoreCase(String nome);

	// select * from tb_categorias where categoria like "%categoria%";
}
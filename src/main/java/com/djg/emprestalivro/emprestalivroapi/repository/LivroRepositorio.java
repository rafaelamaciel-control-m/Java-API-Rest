package com.djg.emprestalivro.emprestalivroapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djg.emprestalivro.emprestalivroapi.dominio.Livro;

public interface LivroRepositorio extends JpaRepository<Livro, Long>{

}

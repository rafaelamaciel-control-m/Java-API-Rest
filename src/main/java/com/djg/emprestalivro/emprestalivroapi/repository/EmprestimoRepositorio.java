package com.djg.emprestalivro.emprestalivroapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djg.emprestalivro.emprestalivroapi.dominio.Emprestimo;

public interface EmprestimoRepositorio extends JpaRepository<Emprestimo, Long>{

}

package com.djg.emprestalivro.emprestalivroapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djg.emprestalivro.emprestalivroapi.dominio.Livro;
import com.djg.emprestalivro.emprestalivroapi.repository.LivroRepositorio;

@Service
public class LivroServico {
	
	@Autowired
	private LivroRepositorio livroRepositorio;

	public void salva(Livro livro) {
		livroRepositorio.save(livro);
	}

}

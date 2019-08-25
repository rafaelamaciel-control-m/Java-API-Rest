package com.djg.emprestalivro.emprestalivroapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.djg.emprestalivro.emprestalivroapi.dominio.Livro;
import com.djg.emprestalivro.emprestalivroapi.service.EmprestimoServico;
import com.djg.emprestalivro.emprestalivroapi.service.LivroServico;
import com.djg.emprestalivro.emprestalivroapi.vo.EmprestimoVO;

@RestController
public class LivroController {
	
	@Autowired
	private LivroServico livroServico;
	
	@PostMapping("/livro")
	public void criarEmprestimo(@RequestBody Livro livro) {
		livroServico.salva(livro);
	}
}

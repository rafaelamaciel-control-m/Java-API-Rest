package com.djg.emprestalivro.emprestalivroapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.djg.emprestalivro.emprestalivroapi.dominio.Usuario;
import com.djg.emprestalivro.emprestalivroapi.service.UsuarioServico;

@RestController
public class UsuarioController {
	
@Autowired
private UsuarioServico usuarioServico;
	
	@PostMapping("/usuario")
	public void criarEmprestimo(@RequestBody Usuario usuario) {
		usuarioServico.salva(usuario);
	}
}

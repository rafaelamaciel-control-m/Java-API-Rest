package com.djg.emprestalivro.emprestalivroapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djg.emprestalivro.emprestalivroapi.dominio.Usuario;
import com.djg.emprestalivro.emprestalivroapi.repository.UsuarioRepositorio;

@Service
public class UsuarioServico {
	
	//instanciando o UsuarioRepository
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	public void salva(Usuario usuario) {
		usuarioRepositorio.save(usuario);
	}
}

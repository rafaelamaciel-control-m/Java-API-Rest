package com.djg.emprestalivro.emprestalivroapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djg.emprestalivro.emprestalivroapi.dominio.Emprestimo;
import com.djg.emprestalivro.emprestalivroapi.dominio.Livro;
import com.djg.emprestalivro.emprestalivroapi.dominio.Usuario;
import com.djg.emprestalivro.emprestalivroapi.repository.EmprestimoRepositorio;
import com.djg.emprestalivro.emprestalivroapi.repository.LivroRepositorio;
import com.djg.emprestalivro.emprestalivroapi.repository.UsuarioRepositorio;
import com.djg.emprestalivro.emprestalivroapi.vo.EmprestimoVO;

@Service
public class EmprestimoServico {

	@Autowired
	private EmprestimoRepositorio emprestimoRepositorio;
	@Autowired
	private LivroRepositorio livroRepositorio;
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	public void salva(EmprestimoVO emprestimoVO) {
		Livro livro = livroRepositorio.findById(emprestimoVO.getCodigoLivro()).get();
		
		Usuario usuario = usuarioRepositorio.findById(emprestimoVO.getCodigoUsuario()).get();
		
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setLivro(livro);
		emprestimo.setUsuario(usuario);
		emprestimo.setDataDevolucao(emprestimoVO.getDataDevolucao());
		emprestimo.setDataSolicitacao(emprestimoVO.getDataSolicitacao());
		
		
		
		emprestimoRepositorio.save(emprestimo);
	}
	
}

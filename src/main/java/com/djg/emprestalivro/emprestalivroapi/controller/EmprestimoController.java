package com.djg.emprestalivro.emprestalivroapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.djg.emprestalivro.emprestalivroapi.service.EmprestimoServico;
import com.djg.emprestalivro.emprestalivroapi.vo.EmprestimoVO;

@RestController
public class EmprestimoController {
	
	@Autowired
	private EmprestimoServico emprestimoServico;
	
	@PostMapping("/emprestimo")
	public void salvaEmprestimo(@RequestBody EmprestimoVO emprestimoVO) {
		
		emprestimoServico.salva(emprestimoVO);
	}
	

}

package com.djg.emprestalivro.emprestalivroapi.dominio;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//O parametro Entity é uma entidade no banco de dados
@Entity
public class Emprestimo {

//Mostra que codigo vai ser o ID da minha tabela e Generate vai gerar o codigo automatico	
	@Id
	@GeneratedValue
	private Long codigoEmprestimo;
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Livro livro;
	private LocalDate dataSolicitacao;
	private LocalDate dataDevolucao;
	
	
	public Long getCodigoEmprestimo() {
		return codigoEmprestimo;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public LocalDate getDataSolicitacao() {
		return dataSolicitacao;
	}
	public void setDataSolicitacao(LocalDate dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	
	
	
}

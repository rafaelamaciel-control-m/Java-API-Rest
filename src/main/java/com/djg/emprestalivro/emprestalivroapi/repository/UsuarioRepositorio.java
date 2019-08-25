package com.djg.emprestalivro.emprestalivroapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.djg.emprestalivro.emprestalivroapi.dominio.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}

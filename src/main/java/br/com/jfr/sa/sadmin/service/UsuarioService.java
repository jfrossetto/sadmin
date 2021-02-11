package br.com.jfr.sa.sadmin.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jfr.sa.sadmin.repository.UsuarioRepository;
import br.com.jfr.sa.sadmin.model.Usuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepo ;
	
	public Iterable<Usuario> findAll() {
		return usuarioRepo.findAll();
	}
	
	public Optional<Usuario> findOne(Long id) {
		return usuarioRepo.findById(id);
	}

	public Usuario update(Usuario usuario) {
		return usuarioRepo.save(usuario);
	}

}

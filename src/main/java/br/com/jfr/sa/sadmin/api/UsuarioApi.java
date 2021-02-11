package br.com.jfr.sa.sadmin.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.jfr.sa.sadmin.model.Usuario;
import br.com.jfr.sa.sadmin.service.UsuarioService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api/usuario")
public class UsuarioApi {
	
	@Autowired
	private UsuarioService usuarioService ;
	
	@RequestMapping(value = "/usuarios" , method = RequestMethod.GET)
	public Iterable<Usuario> findAll() {
	        return usuarioService.findAll();
	}
	
	//@GetMapping(path = {"/{id}"})
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Usuario findOne(@PathVariable("id") Long id) {
		Usuario usuario = usuarioService.findOne(id).orElse(null);
		System.out.println( usuario.getNome() );
        return usuario ;
    }	
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Usuario update(@RequestBody Usuario usuario) {
		return usuarioService.update(usuario);
	}
	
	/*
	@GetMapping("/usuarios")
	public ResponseEntity findAll() {
			List<Usuario> usuarios = (List<Usuario>) usuarioService.findAll() ;
	        return new ResponseEntity( usuarios , HttpStatus.OK);
	}
	*/
	
}

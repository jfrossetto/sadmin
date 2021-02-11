package br.com.jfr.sa.sadmin.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="sa_usuario")
public class Usuario {

	@Id
    @Column(name = "iduser", unique = true, updatable = false)
	@SequenceGenerator(name="user_gen", sequenceName="sa_usuario_s" , allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="user_gen")	
	private Long id;

	@Column(name="login")
	private String login;

	@Column(name="senha")
	private String senha;

	@Getter @Setter
	@Column(name="nome")
	private String nome;

	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar ultimoLogin ;
	
}

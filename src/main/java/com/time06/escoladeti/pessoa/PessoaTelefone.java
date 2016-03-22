package com.time06.escoladeti.pessoa;

import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;

import com.time06.escoladeti.ModeloBase;

public class PessoaTelefone extends ModeloBase {

	@Id
	private String id;
	private int codigo;
	private String numero;
	private String operadora;
	private String contato;
	
	@ManyToOne
	@JoinColumn(name="IDPessoa")
	private Pessoa pessoa;
	
	public String getId() {
		this.id = UUID.randomUUID().toString();
		return id;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public String getOperadora() {
		return operadora;
	}
	
	public String getContato() {
		return contato;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
}

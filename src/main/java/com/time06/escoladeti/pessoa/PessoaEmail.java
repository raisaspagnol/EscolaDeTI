package com.time06.escoladeti.pessoa;

import javax.persistence.Id;

import com.time06.escoladeti.ModeloBase;

public class PessoaEmail extends ModeloBase {

	@Id
	private String id;
	private int codigo;
	private String email;
	private String contato;
	
	public String getId() {
		return id;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getEmail() {
		return email;
	}
	public String getContato() {
		return contato;
	}
	
}

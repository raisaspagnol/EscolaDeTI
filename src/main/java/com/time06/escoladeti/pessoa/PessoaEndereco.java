package com.time06.escoladeti.pessoa;

import javax.persistence.Id;

import com.time06.escoladeti.ModeloBase;

public class PessoaEndereco extends ModeloBase {

	@Id
	private String id;
	private int codigo;
	private String cep;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private Pessoa pessoa;
	
	
	public String getId() {
		return id;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getCep() {
		return cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getNumero() {
		return numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
}

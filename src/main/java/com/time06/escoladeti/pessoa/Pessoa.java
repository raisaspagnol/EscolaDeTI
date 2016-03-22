package com.time06.escoladeti.pessoa;

import java.util.UUID;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import com.hazelcast.core.IList;
import com.time06.escoladeti.Tipos.TipoPessoa;

public abstract class Pessoa {

	@Id
	private String id;
	private int codigo;
	private String nome;
	private String cnpj_cpf;
	private String razaoSocial;
	private String inscricaoEstadual;
	private String dtNascimento;
	private TipoPessoa tipoPessoa;
	private IList<PessoaTelefone> pessoaTelefones;
	private IList<PessoaEndereco> pessoaEnderecos;
	private IList<PessoaEmail> pessoaEmail;
	private String foto;
	
	
	public String getId() {
		this.id = UUID.randomUUID().toString();
		return id;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCnpj_cpf() {
		return cnpj_cpf;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	
	public String getDtNascimento() {
		return dtNascimento;
	}
	
	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}
	
	@OneToMany(mappedBy = "pessoa", targetEntity = PessoaTelefone.class, fetch = FetchType.LAZY,
	cascade = CascadeType.ALL)
	public IList<PessoaTelefone> getPessoaTelefones() {
		return pessoaTelefones;
	}
	
	@OneToMany(mappedBy="pessoa", targetEntity = PessoaEndereco.class, fetch = FetchType.LAZY,
	cascade = CascadeType.ALL)
	public IList<PessoaEndereco> getPessoaEnderecos() {
		return pessoaEnderecos;
	}
	
	@OneToMany(mappedBy="pessoa", targetEntity = PessoaEmail.class, fetch = FetchType.LAZY,
	cascade = CascadeType.ALL)
	public IList<PessoaEmail> getPessoaEmail() {
		return pessoaEmail;
	}
	
	public String getFoto() {
		return foto;
	}
	
}

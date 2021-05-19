package br.com.fiap.intencaofinanciamento.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_intencao")
public class Intencao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeCliente;
	
	private String logradouro;
	
	private String numero;
	
	private String estado;
	
	private String cep;
	
	private String telefone;
	
	private String celular;
	
	private String cpf;
	
	private String rg;
	
	private Instant dataNascimento;
	
	private String categoriaFinanciamento;
	
	private Double valorIntencao;
	
	public Intencao() {
		
	}

	public Intencao(Long id, String nomeCliente, String logradouro, String numero, String estado, String cep,
			String telefone, String celular, String cpf, String rg, Instant dataNascimento,
			String categoriaFinanciamento, Double valorIntencao) {
		super();
		this.id = id;
		this.nomeCliente = nomeCliente;
		this.logradouro = logradouro;
		this.numero = numero;
		this.estado = estado;
		this.cep = cep;
		this.telefone = telefone;
		this.celular = celular;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.categoriaFinanciamento = categoriaFinanciamento;
		this.valorIntencao = valorIntencao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Instant getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Instant dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCategoriaFinanciamento() {
		return categoriaFinanciamento;
	}

	public void setCategoriaFinanciamento(String categoriaFinanciamento) {
		this.categoriaFinanciamento = categoriaFinanciamento;
	}

	public Double getValorIntencao() {
		return valorIntencao;
	}

	public void setValorIntencao(Double valorIntencao) {
		this.valorIntencao = valorIntencao;
	}
	
	
	
}

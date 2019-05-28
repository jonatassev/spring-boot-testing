package br.com.michelmilezzi.DemoApp.domain;

import javax.persistence.Entity;

@Entity
public class Vendedor {
	
	
	private String nome;
	private Double salario;
	private Double comissao;
	private Venda venda;
	
	
	
	public Vendedor() {
	
	}
	
	public String getNome() {
		return nome;
	}
	public Double getSalario() {
		return salario;
	}
	public Double getComissao() {
		return comissao;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	
	
	
	
}

package br.com.michelmilezzi.DemoApp.domain;

import javax.persistence.Entity;

@Entity
public class Venda {
	
	
	private String nome;
	private Double preço;
	
	public Venda() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public Double getPreço() {
		return preço;
	}
	
}

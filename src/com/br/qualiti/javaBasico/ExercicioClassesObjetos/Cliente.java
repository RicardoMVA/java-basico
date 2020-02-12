package com.br.qualiti.javaBasico.ExercicioClassesObjetos;

import com.br.qualiti.javaBasico.ExercicioStringsArrays.TipoCliente;

public class Cliente {
	private String nome;
	private double cpf;
	private TipoCliente tipoCliente;

	public Cliente() {

	}

	public Cliente(String nome, double cpf, TipoCliente tipoCliente) {
		this.nome = nome;
		this.cpf = cpf;
		this.tipoCliente = tipoCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
}

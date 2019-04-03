package com.conexao.agenda;

public class Contato {
	private int id;
	private String nome;
	private String telefone;

	public Contato() {
		this.id = 0;
		this.nome = new String();
		this.telefone = new String();
	}

	public Contato(String nome, String telefone) {
		this();
		this.nome = nome;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}

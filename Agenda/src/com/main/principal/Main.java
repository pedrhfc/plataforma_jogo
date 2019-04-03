package com.main.principal;

import javax.swing.JOptionPane;

import com.conexao.agenda.Contato;
import com.conexao.agenda.ContatoDAO;

public class Main {

	public static void main(String[] args) {
		String nome, telefone = new String();
		Contato contato = new Contato();
		nome = JOptionPane.showInputDialog(null,"Nome:");
		telefone = JOptionPane.showInputDialog(null,"Telefone:");
		contato.setNome(nome);
		contato.setTelefone(telefone);

		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.inserir(contato);
		

	}

}

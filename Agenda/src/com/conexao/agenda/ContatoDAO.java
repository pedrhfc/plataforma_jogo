package com.conexao.agenda;

import org.apache.ibatis.session.SqlSession;

import com.example.conexao.Conexao;

public class ContatoDAO {

	public void inserir(Contato contato) {
		SqlSession session = Conexao.getConexao().openSession();
		ContatoMapper mapper = session.getMapper(ContatoMapper.class);
		mapper.InserirContato(contato);
		session.commit();
		session.close();
	}
}

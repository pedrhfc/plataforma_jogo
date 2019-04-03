package com.conexao.agenda;
import org.apache.ibatis.annotations.Insert;

public interface ContatoMapper {	
	@Insert("INSERT INTO contato(nome,telefone) VALUES(#{nome}, #{telefone})")
	
	void InserirContato(Contato contato);

}

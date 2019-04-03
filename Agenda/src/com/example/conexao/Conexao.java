package com.example.conexao;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Conexao {

	private static SqlSessionFactory sqlSessionFactory;
	static {
		try {
			String resource = "config_conexao.xml";
			InputStream stream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getConexao() {
		return sqlSessionFactory;
	}

}

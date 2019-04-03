DROP DATABASE if exists plataforma_jogo;
CREATE DATABASE plataforma_jogo;
USE plataforma_jogo;
CREATE TABLE usuario(id INT primary key auto_increment,
	email VARCHAR(40) not null,
	senha VARCHAR(40) not null,
	data_nascimento DATE not null,
	nome VARCHAR(80) not null,
	nickname VARCHAR(32) not null,
	sexo CHAR(3) not null,
	endereco VARCHAR(80) not null,
	telefone VARCHAR(13) not null,
	rank VARCHAR(32),
	CONSTRAINT check_sexo CHECK(sexo in ('F','M','I'))
);

CREATE TABLE empresa(cnpj VARCHAR(18) primary key,
	nome VARCHAR(80) not null,
	endereco VARCHAR(80) not null,
	telefone VARCHAR(13) not null,
	email VARCHAR(40) not null,
	resumo_jogo MEDIUMTEXT not null
);

CREATE TABLE jogo(id INT primary key auto_increment,
	nome VARCHAR(80) not null,
	categoria_jogo VARCHAR(32) not null,
	empresa_desenvolvedora VARCHAR(18) not null,
	idade_minima INT not null,
	descricao LONGTEXT not null,
	CONSTRAINT fk_empresa FOREIGN KEY (empresa_desenvolvedora) references empresa(cnpj)
);

CREATE TABLE partida(id INT primary key auto_increment,
	partida_jogo INT not null,
	data_inicio DATE not null,
	data_fim DATE not null,
	hora_inicio TIME not null,
	hora_fim TIME not null,
	participante VARCHAR(32) not null,
	CONSTRAINT fk_jogo FOREIGN KEY (partida_jogo) references jogo(id)
);

CREATE TABLE usuario_partida(id_usuario INT not null,
	id_partida INT not null,
	CONSTRAINT fk_usuario FOREIGN KEY (id_usuario) references usuario(id),
	CONSTRAINT fk_partida FOREIGN KEY (id_partida) references partida(id),
	pontos INT not null,
	primary key(id_usuario,id_partida)
);

create database dbaulachaves1;
use dbaulachaves1;

CREATE TABLE tb1_pessoa(
	idPessoa integer PRIMARY KEY AUTO_INCREMENT,
    nome varchar(255));

CREATE TABLE tb2_carro(
	idCarro integer PRIMARY KEY AUTO_INCREMENT,
    nomeCarro varchar(255),
    marca varchar(255),
    idPessoa integer,
	FOREIGN KEY (idPessoa) REFERENCES tb1_pessoa (idPessoa));
    
insert into tb1_pessoa (nome) values 
	('juliana'),
    ('julio'),
    ('marcio');
    
SELECT * FROM tb1_pessoa;
    
insert into tb2_carro(nomeCarro, marca, idPessoa) values
	('Gol','Wolks',2),
    ('Palio','Fiat',3);
    
SELECT * FROM tb2_carro

inner join tb1_pessoa
where tb1_pessoa.idPessoa=tb2_carro.idPessoa;

#limpa os dados truncate
truncate tb2_carro;
truncate tb1_pessoa;
#apaga os datod drop
drop table tb1_pessoa;
drop table tb2_carro;




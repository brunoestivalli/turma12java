create database ecommerce;
use ecommerce;

create table  Produto (
	id int not null auto_increment primary key,
    nome varchar(100) not null,
    preco double (9,2),
    altura double (6,2),
    peso double (6,2));
    
insert into Produto(nome, preco, altura, peso) values
	('celular',4599.99,0.15,0.19),
	('carro',95999.99,2.05,1000),
	('computador',5599.99,0.5,1.2),
	('geladeira',6499.99,1.88,45),
	('fogão',1599.99,0.69,15),
	('iate',450899.99,15,3000),
	('livro',45.99,0.35,0.29),
	('arco',1399.99,0.75,2.04);
    
select * from Produto where preco >=500;

select * from Produto where preco <=500;

update Produto set altura=1.95 where id=2;

select * from Produto;

create database db_estoque;
use db_estoque;

create table tb_marcas(
	id bigint(5) auto_increment,
    nome varchar(20) not null,
    ativo boolean,
    primary key(id)
);

select * from tb_marcas;
select * from tb_marcas where id<2;
delete from tb_marcas where id=2;
select * from tb_marcas where nome like "%lo%";

insert into tb_marcas(nome, ativo) values("Nike", true);

insert into tb_marcas(nome, ativo) values
	("Nike", true),
	("Louis Vuitton", true),
    ("Rolex", true),
    ("Gucci", true);
	

update tb_marcas set nome = "Adidas", ativo= true where id = 1;
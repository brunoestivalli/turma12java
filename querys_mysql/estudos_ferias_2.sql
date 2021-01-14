use db_estoque;

create table tb_produtos(
	id bigint auto_increment,
	nome varchar(30) not null,
	preco decimal(10,2),
	marca_id bigint not null,
	primary key(id),
	foreign key (marca_id) references tb_marcas (id)
);

insert into tb_produtos (nome, preco, marca_id) values 
("camisa", 22.99, 1),
("tenis", 69.99, 3),
("relogio", 129.65, 4);

select tb_produtos.nome,tb_produtos.preco,tb_marcas.nome from tb_produtos
	inner join tb_marcas on tb_marcas.id = tb_produtos.marca_id;
truncate  tb_produtos;





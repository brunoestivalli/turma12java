create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categorias(

	idcategoria integer PRIMARY key,
    disponiveis varchar(100));
    
create table tb_pizza(

	idPizza integer PRIMARY KEY KEY AUTO_INCREMENT,
	nome varchar(100),
    preco double(6,2),
    sabor varchar(100),
    tamanho varchar(100),
    idCat int,
	constraint fk_categorias FOREIGN KEY (idCat) REFERENCES tb_categorias (idcategoria));
   
   insert into tb_categorias (idcategoria,disponiveis) values 
	(1,'Salgada'),
    (2,'Doce'),
    (3,'Vegana'),
    (4,'Especial da Casa'),
    (5,'Agridoce');
    
    select * from tb_categorias;

    
    insert into tb_pizza (nome, preco, sabor, tamanho, idCat) values
    ('Bruno Estivalli', 55.60, 'Marguerita','Grande',1), 
	('Carlos Alberto', 103.54, 'Brigadeiro','Extra Grande',2), 
	('Vitor Arthur', 25.68, 'Calabresa','Brotinho',1), 
	('Vitoria Demiurgos', 45.60, 'Marguerita com baicon','Grande',4), 
	('Matheus Estuvis', 27.43, 'frango com catupiry e mel','brotinho',5), 
	('David Henrique', 76.67, 'Espinafre','Grande',3), 
	('Camilla Guerra', 43.65, 'Brigadeiro com Morango','Grande',2), 
	('Abiner Rodrigo', 42.60, '4 queijos','Grande',1);
    
    select * from tb_pizza;
    
    select * from tb_pizza where preco > 45;
    
    select * from tb_categorias
    inner join tb_pizza
	ON tb_pizza.idCat=tb_categorias.idcategoria;
    
    select * from tb_pizza0 where idcategoria =2;
    
    drop table tb_pizza;
     drop table tb_categorias;
    
	
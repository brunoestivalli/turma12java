create database RH;
use RH;

create table funcionario(
	id int not null auto_increment primary key,
    nome varchar(100) NOT NULL,
    nascimento date,
	salario double(8,2),
	nacionalidade varchar(20) DEFAULT 'Brasil');
    
insert into funcionario(nome, nascimento,salario) values
	('Bruno','2000-10-28',2000.54),
    ('Gabriela','2000-5-25',10000.54),
    ('Roberto','1998-10-5',1995.54),
    ('Raquel','1995-4-14',7500),
    ('David','1996-12-25',1775.43);
    
    Select * from funcionario where salario >=2000;
    
    Select * from funcionario where salario <=2000;
    
     update funcionario set nome='Ana' where id='4';
     
     select * from funcionario;

    


 
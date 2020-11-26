create database  if not exists db_Fiat;
use db_Fiat;

create table  if not exists funcionarios1(
	id int not null auto_increment,
	nome varchar(30) NOT NULL,
	nascimento date,
	sexo enum('M','F'),
	peso decimal(5,2),
	altura decimal(3,2),
    dia_cadastro DATETIME DEFAULT CURRENT_TIMESTAMP,
	nacionalidade varchar(20) DEFAULT 'Brasil',
    primary key(id)
    )engine=innodb;
    
    truncate funcionarios1;
    insert into funcionarios1 (nome,nascimento, sexo, peso, altura)values
    ('alex tenorio da silva','1998-02-03','M','58.5',2.05);
    select * from funcionarios1;
    
    insert into funcionarios1 (nome,nascimento, sexo, peso, altura)values
			('Gabriela','1998-02-03','F','58.5',1.60),
            ('João','1998-02-04','M',68.5,1.80),
            ('Marcio','1998-03-02','M','69.5',1.70);
    
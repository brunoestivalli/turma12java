create table funcionarios(
	id int not null auto_increment primary key,
	nome varchar(30) NOT NULL,
	nascimento date,
	sexo enum('M','F'),
	peso decimal(5,2),
	altura decimal(3,2),
    dia_cadastro DATETIME DEFAULT CURRENT_TIMESTAMP,
	nacionalidade varchar(20) DEFAULT 'Brasil');
    
#mostrar id no fim
#Comandos DDL(data Definition language, create, drop, alter , rename)

describe funcionarios;

alter table funcionarios modify column nome char(255);

alter table funcionarios add column historico varchar(50) after nome;
alter table funcionarios drop column historico;

RENAME TABLE funcionarios TO colaboradores;

show tables;
use Fiat;
select * from Pessoa;






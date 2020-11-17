package Aplicacao;

import java.util.Scanner;
import Entidades.Disciplina;
import Entidades.Pessoa;

public class CadAluno {

	public static void main(String[] args) {
		
		Pessoa aluno = new Pessoa("Bruno","Estivlli");
		Disciplina cursoPessoa= new Disciplina();
		Scanner read=new Scanner(System.in);
		int escolha=0;
		
		System.out.println("Sistema de cadastro de aluno por matéria");
		
		System.out.println("Digite o nome do aluno: ");
		aluno.nome=read.next();
		
		System.out.println("Digite M-Masculino, F-feminino ou O-outros: ");
		aluno.genero=read.next().toUpperCase().charAt(0);
		
		System.out.println("Escolha 1-Java ou 2-SQL: ");
		escolha=read.nextInt();
		
		if(escolha==1) {
			cursoPessoa.nome="Java";
		}else if(escolha==2) {
			cursoPessoa.nome="SQL";
		}else {
			System.out.println("Você não escolheu direito");
		}
	
		if(aluno.genero =='F') {
			
			System.out.printf("Oi %s, você é agora aluna do curso de %s",aluno.nome, cursoPessoa.nome);
			
		}else if(aluno.genero=='M') {
			
			System.out.printf("Oi %s, você é agora aluno do curso de %s",aluno.nome, cursoPessoa.nome);
			
		}else if(aluno.genero=='O') {
			
			System.out.printf("Oi %s, você é agora alunx do curso de %s",aluno.nome, cursoPessoa.nome);	
			
		}else {
			
			System.out.println("Você não escolheu um genero");
			
		}
	
	}

}

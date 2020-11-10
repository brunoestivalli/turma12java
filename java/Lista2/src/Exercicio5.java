/*
 * A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias
 *  que são altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 
 *  até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem 
 *  suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a 
 *  suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser notificados a
 *   paralisarem suas atividades. Faça um sistema que leia o índice de poluição medido e emita a
 *    notificação adequada aos diferentes grupos de empresas.
 */

import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		float P;
		
		System.out.println("Digite o índice de poluição: ");
		P=read.nextFloat();
		
		
		if(P>=0.05 && P<0.25) {
			System.out.println("Niveis de Poluição dentro do permitido");
		}
		else if(P>=0.3 && P<0.4) {
			System.out.println("indústrias do 1º grupo precisam suspender suas atividades");
						
		}
		else if(P>=0.4 && P<0.5) {
			System.out.println("indústrias do 1º e 2º grupo precisam suspender suas atividades");
				
		}
		else if(P>=0.5) {
			System.out.println("indústrias de todos os grupos precisam suspender suas atividades");
		
		}
		
	}
}

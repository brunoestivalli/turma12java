/*
 * A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de ind�strias
 *  que s�o altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel varia de 0,05 
 *  at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a suspenderem 
 *  suas atividades, se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o intimadas a 
 *  suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem ser notificados a
 *   paralisarem suas atividades. Fa�a um sistema que leia o �ndice de polui��o medido e emita a
 *    notifica��o adequada aos diferentes grupos de empresas.
 */

import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		float P;
		
		System.out.println("Digite o �ndice de polui��o: ");
		P=read.nextFloat();
		
		
		if(P>=0.05 && P<0.25) {
			System.out.println("Niveis de Polui��o dentro do permitido");
		}
		else if(P>=0.3 && P<0.4) {
			System.out.println("ind�strias do 1� grupo precisam suspender suas atividades");
						
		}
		else if(P>=0.4 && P<0.5) {
			System.out.println("ind�strias do 1� e 2� grupo precisam suspender suas atividades");
				
		}
		else if(P>=0.5) {
			System.out.println("ind�strias de todos os grupos precisam suspender suas atividades");
		
		}
		
	}
}

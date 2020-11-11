/*
 * Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, 
 * a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo
 *  valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
 */
		


import java.util.Scanner;
public class Exercicio1While {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int x=0,T=0,Mx=0,r=0;
		
		while(x>=0) {
			r=r+1;
			T=T+x;
			Mx=T/r;
			System.out.println("Digite um número: ");
			x=read.nextInt();
			
		}
	
		
		System.out.println("A soma dos números é de:"+ T);
		
		System.out.println("A somatoria dos números é de:"+ r);
		
		System.out.println("A média é de: "+ Mx);
		
		

		
		
	}
}

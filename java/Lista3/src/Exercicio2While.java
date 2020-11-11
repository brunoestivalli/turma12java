/*
 * Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  (imprimindo o novo valor) 
 * até que ele seja maior do que 100. Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte 
 * sequência: 5 15 45 135.
 */


import java.util.Scanner;
public class Exercicio2While {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int x=0;
		System.out.println("Digite um número: ");
		x=read.nextInt();
		
		while(x<100) {
			x=x*3;	
			
			System.out.println(x);
		}
		
		
		
	
			

	}
}

/*
 * Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele por tr�s  (imprimindo o novo valor) 
 * at� que ele seja maior do que 100. Ex.: se o usu�rio digita 5,  deveremos observar na tela a seguinte 
 * sequ�ncia: 5 15 45 135.
 */


import java.util.Scanner;
public class Exercicio2While {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int x=0;
		System.out.println("Digite um n�mero: ");
		x=read.nextInt();
		
		while(x<100) {
			x=x*3;	
			
			System.out.println(x);
		}
		
		
		
	
			

	}
}

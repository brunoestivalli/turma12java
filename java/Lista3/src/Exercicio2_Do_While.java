/*
 * Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os n�meros  de 1 at� ele. 
 * Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.

 */

import java.util.Scanner;
public class Exercicio2_Do_While {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int x=0,num=0;
		System.out.println("Digite um n�mero: ");
		x=read.nextInt();
		do {
			num=num+x;
			x=x-1;
			
		
		}while(x>0);
		System.out.println(num);
	}
}

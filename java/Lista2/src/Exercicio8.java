/*
 * Construa um sistema para ler uma vari�vel num�rica N e imprimi-la somente se a mesma for maior 
 * que 100, caso contr�rio imprimi-la com o valor zero.
 */

import java.util.Scanner;
public class Exercicio8 {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		int N;
		System.out.println("Digite um n�mero: ");
		N=read.nextInt();
		
		if(N>100) {
			System.out.println(N);
			
		}
		else {
			N=0;
			System.out.println(0);
		}
		
	}
}

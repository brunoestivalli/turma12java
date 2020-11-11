/*
 * Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e que se encontram no 
 * conjunto dos números de 1 até 500.
 */

import java.util.Scanner;
public class Exercicio2For {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int x=0,T=0;
		for(x=1;x<500;x++) {
			if((x%3)==0 && ((x%2)==1)) {
				System.out.println(x);
				T=T+x;
			}
			
		}
		
		System.out.println("A soma é de: "+T);

	}
}

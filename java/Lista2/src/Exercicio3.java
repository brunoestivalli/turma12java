/*
 * Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.

 */


import java.util.Scanner;
public class Exercicio3 {
	public static void main(String [] args) {
		Scanner read = new Scanner(System.in);
		int x,y,z,w;
		
		System.out.println("Digite um número: ");
		x=read.nextInt();
		
		System.out.println("Digite mais um número: ");
		y=read.nextInt();
		
		System.out.println("Digite mais um número: ");
		z=read.nextInt();
		
		System.out.println("Digite mais um número: ");
		w=read.nextInt();

		
		if((z*z)<=1000) {
			System.out.println("O valor digitado é de: "+x);
			System.out.println("E seu quadrado é de: "+Math.pow(x,2));
			
			System.out.println("O segundo valor digitado é de: "+y);
			System.out.println("E seu quadrado é de: "+Math.pow(y,2));
			
			System.out.println("O terceiro valor digitado é de: "+z);
			System.out.println("E seu quadrado é de: "+Math.pow(z,2));
			
			System.out.println("O quarto valor digitado é de: "+w);
			System.out.println("E seu quadrado é de: "+Math.pow(w,2));
			
		}else {
			
			System.out.println("\nO valor ao quadrado do 3 valor  é de: "+Math.pow(z,2));
		}
		
		read.close();
	}

}

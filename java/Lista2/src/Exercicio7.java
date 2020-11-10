/*
 * Receber valores de base e altura de um triângulo e verificar se são valores válidos 
 * (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo
 */

import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float baseTri, altTri,areaTri;

		System.out.println("Digite valores para a base do triângulo: ");
		baseTri=read.nextFloat();
		System.out.println("Digite valores para altura do triângulo: ");
		altTri=read.nextFloat();
		
		if(baseTri>0 && altTri>0) {
			areaTri=(baseTri*altTri)/2;
			System.out.printf("A área do Triângulo é de %.2f",altTri);
		}else {
			System.out.println("Número de base ou altura menores que zero");
		}
	}
}

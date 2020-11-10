/*
 * Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos 
 * (positivos maiores que zero). Em caso afirmativo, calcular a �rea do tri�ngulo
 */

import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float baseTri, altTri,areaTri;

		System.out.println("Digite valores para a base do tri�ngulo: ");
		baseTri=read.nextFloat();
		System.out.println("Digite valores para altura do tri�ngulo: ");
		altTri=read.nextFloat();
		
		if(baseTri>0 && altTri>0) {
			areaTri=(baseTri*altTri)/2;
			System.out.printf("A �rea do Tri�ngulo � de %.2f",altTri);
		}else {
			System.out.println("N�mero de base ou altura menores que zero");
		}
	}
}

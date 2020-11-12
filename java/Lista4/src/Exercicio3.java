/*
 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

 */

import java.util.Random;
import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		Random random=new Random();
		
		int N1[][]=new int [4][6];
		int N2[][]=new int [4][6];
		int M1[][]=new int [4][6];
		int M2[][]=new int [4][6];
		int linha=0;
		int coluna=0;
		System.out.println("\t\t\tMatriz N1");
		for(linha=0;linha<4;linha++) {
			System.out.println("\n");
			for(coluna=0;coluna<6;coluna++) {
				N1[linha][coluna]=random.nextInt(9);
				System.out.print("\t"+N1[linha][coluna]);
				
			}
		}
		
		System.out.println("\n\n\n");
		System.out.println("\t\t\tMatriz N2");
		for(linha=0;linha<4;linha++) {
			System.out.println("\n");
			for(coluna=0;coluna<6;coluna++) {
				N2[linha][coluna]=random.nextInt(9);
				System.out.print("\t"+N2[linha][coluna]);
				
			}
		}
		System.out.println("\n\n\n");
		System.out.println("\t\t\tMatriz M1");
		for(linha=0;linha<4;linha++) {
			System.out.println("\n");
			for(coluna=0;coluna<6;coluna++) {
				M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna];
				System.out.print("\t"+M1[linha][coluna]);
				
			}
		}
		
		System.out.println("\n\n\n");
		System.out.println("\t\t\tMatriz M2");
		for(linha=0;linha<4;linha++) {
			System.out.println("\n");
			for(coluna=0;coluna<6;coluna++) {
				M2[linha][coluna]=N1[linha][coluna]-N2[linha][coluna];
				System.out.print("\t"+M2[linha][coluna]);
				
			}
		}
	}
	
	

}

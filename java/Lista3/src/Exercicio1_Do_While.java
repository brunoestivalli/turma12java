/*
 *  Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de 3 em 3 quando estiver 
 *  entre 300 e 400 e de 5 em 5 quando não estiver.
 */

import java.util.Scanner;
public class Exercicio1_Do_While {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int x=0;
		do {
			for(x=233;x<297;x++) {
				x=x+4;
				System.out.println(x);
			}
			for(x=300;x<400;x++) {
				x=x+2;
				System.out.println(x);
			}
			for(x=402;x<456;x++) {
				x=x+4;
				System.out.println(x);
			}
			
		}while(x<456);
		
		
		
	}

}

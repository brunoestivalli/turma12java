/*
 * Faça um programa que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
 */

import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		double x;
		 double y=0,z=0;
		for(x=0;x<99;x++) {
			y=y+1;
			x=x+1;
			z=x/y;
			
			System.out.printf("\n%.2f",x,"\n");
			System.out.print("/");
			System.out.printf("%.2f = %.2f",y,z,"\n");
		}
		
		
	}

}

/*
 * Escrever um programa que leia uma quantidade desconhecida de números e conte quantos deles estão nos seguintes 
 * intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando for lido um número negativo.
 */

import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int x=0,x1=0,x2=0,x3=0,x4=0;
		boolean confirmar=true;
		
		do {
			System.out.println("\nDigite um número: ");
			x=read.nextInt();
			if(x>0) {
				confirmar=true;
			}else if(x<0) {
				confirmar=false;
			
			}else if(x>0 && x<=25) {
				x1=x1++;
			}else if(x>=26 && x<=50) {
				x2=x2++;
			}else if(x>=51 && x<=75) {
				x3=x3++;
			}else if(x>=76 && x<=101) {
				x4=x4++;
			}
			System.out.printf("\nEntre os numeros 0~25: %d",x1);
			System.out.printf("\nEntre os numeros 26~50: %d",x2);
			System.out.printf("\nEntre os numeros 51~75: %d",x3);
			System.out.printf("\nEntre os numeros 76~100: %d",x4);
			
			
	
		}while(confirmar==true);
	}
}

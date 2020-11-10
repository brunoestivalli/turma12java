/*
 *  Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é
 *   par ou ímpar, e se é positivo ou negativo.
 */

import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		int x;
		System.out.println("Digite um número: ");
		x=read.nextInt();
		
		if(x%2==0) {
			System.out.print("Esse número é par");
		}else {
			System.out.print("Esse número é impar");
		}
		
		if(x>0) {
			System.out.print(" e positivo");
		}else {
			System.out.print(" e negativo");
		}
	}
}

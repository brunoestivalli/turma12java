/*
 *  Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este n�mero �
 *   par ou �mpar, e se � positivo ou negativo.
 */

import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		int x;
		System.out.println("Digite um n�mero: ");
		x=read.nextInt();
		
		if(x%2==0) {
			System.out.print("Esse n�mero � par");
		}else {
			System.out.print("Esse n�mero � impar");
		}
		
		if(x>0) {
			System.out.print(" e positivo");
		}else {
			System.out.print(" e negativo");
		}
	}
}

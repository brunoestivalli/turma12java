package Programas;

import java.util.Scanner;

import Classes.Empregado;

public class TesteEmpregado {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		double valor1=0;
		double valor2=0;
		
		Empregado empregado= new Empregado(null, null, null, 0, valor1, valor2);
		
		System.out.println("Escreva valor do Sal�rio: ");
		valor1=read.nextDouble();
		
		System.out.println("Escreva valor do imposto");
		valor2=read.nextDouble();
		
		System.out.println("O sal�rio apos a corre��o, � de: "+empregado.calculaSalario(valor1,valor2));
	
	}

}

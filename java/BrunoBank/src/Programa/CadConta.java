package Programa;

import java.util.Scanner;

import Classes.ContaCorrente;

public class CadConta {

	public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);
		char opcao;
		double valor;
		String CPF =  " ";
		int numeroConta = 0;
		System.out.println("Digite da conta:");
		numeroConta=read.nextInt();
		System.out.println("Digite o número do CPF:");
		CPF=read.next();
		
		ContaCorrente cc1 = new ContaCorrente(numeroConta,CPF);
		
		System.out.println("Número da conta: "+cc1.getNumero());
		System.out.println("Saldo da conta é de: "+cc1.getSaldo());
		
		System.out.println("Vc deseja C-creditar ou D-debitar um valor ? ");
		opcao = read.next().toUpperCase().charAt(0);
		if(opcao=='C') {
			System.out.println("Qual o valor de crédito: ");
			valor=read.nextDouble();
			cc1.creditar(valor);
		}
		else if(opcao=='D') {
			if(cc1.getSaldo()<=0) {
				System.out.println("Conta sem Saldo, continuar sim ou nao?");
			}else {
				System.out.println("Qual o valor de Débito: ");
				valor=read.nextDouble();
				cc1.debitar(valor);
			}
		}
		System.out.println();
		System.out.println("Número da conta: "+cc1.getNumero());
		System.out.println("Saldo da conta: "+cc1.getSaldo());
		
	}

}

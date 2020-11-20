package Programa;

import java.util.Scanner;


import Classes.ContaPoupanca;

public class TesteContaPoupanca {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int x=0,diaHj=0, numeroConta = 0,dataAniversario=0;
		char opcao;
		double valor=0.0;
		String CPF =  " ";

		System.out.println("Digite da conta:");
		numeroConta=read.nextInt();
		System.out.println("Digite o número do CPF:");
		CPF=read.next();
		System.out.println("Digite a data de aniversario: ");
		dataAniversario=read.nextInt();
		
		ContaPoupanca cp1 = new ContaPoupanca(numeroConta,CPF,dataAniversario);
		
		System.out.println("Número da conta: "+cp1.getNumero());
		System.out.println("Saldo da conta é de: "+cp1.getSaldo());
		System.out.println("O dia de aniversario da conta é: "+cp1.getDataAniversario());
		
		while(x<5) {
			x++;
			System.out.println("Transação "+x);
			System.out.println("Vc deseja C-creditar ou D-debitar um valor ? ");
			opcao = read.next().toUpperCase().charAt(0);
			if(opcao=='C') {
				System.out.println("Digite o dia de hoje: ");
				diaHj=read.nextInt();
				if(diaHj!=dataAniversario) {
					System.out.println("Qual o valor de crédito: ");
					valor=read.nextDouble();
					cp1.creditar(valor);
					System.out.println("Saldo da conta: "+cp1.getSaldo());
				}else if(diaHj==dataAniversario) {
					System.out.println("Qual o valor de crédito: ");
					valor=read.nextDouble();
					cp1.creditar(valor);
					cp1.correcao(diaHj);
					System.out.println("Novo saldo é de: "+cp1.getSaldo());
				}
			}
			else if(opcao=='D') {
				if(cp1.getSaldo()<=0) {
					System.out.println("Conta sem Saldo");
				}else {
					System.out.println("Qual o valor de Débito: ");
					valor=read.nextDouble();
					while(valor>cp1.getSaldo()) {
						System.out.println("Valor acima do saldo, digite novamente");
						valor=read.nextDouble();
					}
					cp1.debitar(valor);
					System.out.println("Novo saldo é de: "+cp1.getSaldo());
					
				}
			}
			
			
			
			System.out.println("Número da conta: "+cp1.getNumero());
			
		}
		System.out.println("Seu Saldo final é de: "+cp1.getSaldo());

	}
}

package Exemplos;

import java.util.Scanner;

public class Teste {
	public static void main(String[] agrs) {
		Scanner read=new Scanner(System.in);
		String nome;
		int qtde;
		int  vetor[]= new  int[4];
		
		try {
			System.out.println("Sitema de notas");
			System.out.println("Digite o nome do aluno: ");
			nome=read.nextLine();
			System.out.println("Digite a quantidade de notas para cadastro: ");
			qtde=read.nextInt();
			
			for(int x=0;x<qtde;x++) {
				System.out.println("Digite a nota "+(x+1)+": ");
				vetor[x]= read.nextInt();
			}
			
		
	}
		catch( java.util.InputMismatchException erro) {
			System.out.println("Digite um número inteiro");
			erro.printStackTrace();
		}
		catch( java.lang.ArrayIndexOutOfBoundsException erro) {
			System.out.println("Tamanho errado");
			
		}
		System.out.println("Todas as notas calculadas");
		System.out.println("Obrigado, fim do programa.");
	
		}
	
		
		
		
		
		
		
		
	
	}



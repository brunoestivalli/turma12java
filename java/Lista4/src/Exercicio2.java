/*
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos,
 *  escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e 
 *  apresente também quantas foram as ocorrências da maior pontuação.
 */

import java.util.Random;
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		Random random=new Random();
		int LIMITE=10;
		int lancamentos[]=new int [10];
		int x = 0;
		int somaLancamentos = 0;
		int maiorValor = 0;
		int contadorMaior=0;
		for (x = 0; x<LIMITE; x++)
				{
					lancamentos[x] = random.nextInt(6);
					System.out.println("\nVALOR NA POSIÇÃO "+x+1+" : "+lancamentos[x]);
					somaLancamentos = somaLancamentos + lancamentos[x];
					if (lancamentos[x] >= maiorValor )
					{
						if (lancamentos[x] != maiorValor)
						{
							contadorMaior = 0;
						}
						maiorValor = lancamentos[x];
						contadorMaior++;
					}
					
				}
				
				System.out.println("\nTotal de valores somados: "+ somaLancamentos);
				System.out.println("\nMedia aritmetica: "+ (somaLancamentos/LIMITE));
				System.out.println("\nMaior valor "+ maiorValor);
				System.out.println("\nQuantas vezes aparece: "+contadorMaior);
				
	
		}
	}

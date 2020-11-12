/*
 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor com os lan�amentos,
 *  escreva esse vetor. A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e 
 *  apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
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
					System.out.println("\nVALOR NA POSI��O "+x+1+" : "+lancamentos[x]);
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

/*
 * Faça um programa que leia um vetor de 5 posições para números reais e, depois, um código inteiro. Se o código for zero,
 *  finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa. Caso, o código 
 *  for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.

 */

import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int vetor[]= {1,2,3,4,5};
		int x;
		int codigo=0;
				
				
				for( x = 0; x<5; x++)
				{
					System.out.println("Digite o valor "+x+" : ");	
					vetor[x]=read.nextInt();
				}
				System.out.println("Digite o codigo 0 /1 /2 :");
				codigo=read.nextInt();
				if(codigo==0){
					System.out.println("Fim");
					
				}else if(codigo==1){
					for( x = 0; x<5; x++){
						System.out.println(" | "+vetor[x]+" |");
					}
					
				}else if(codigo==2){
					for(x=4;x>=0; x--){
						System.out.println("| "+vetor[x]+" |");
					}
				}else{
					System.out.println("Código invalido");
				}
			}
	
	}


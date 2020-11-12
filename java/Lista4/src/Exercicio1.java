/* Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
 * Encontre após a maior pontuação e a apresente.
 * 
 */



import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int x,y=0;
		int num[]=new int[5];
		
		
		for(x=0;x<5;x++) {
			System.out.println("Escreva valores: ");
			num[x]=read.nextInt();
			
		}
		for(x=0;x<5;x++) {
			System.out.println(" Os numeros são: "+num[x]);
			if(y<num[x]) {
				y=num[x];
			
			}
		}
		
		System.out.println("\nO maior numero é de: "+y);
			
	
	
	
	
	
	}
}

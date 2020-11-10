/*
 *  Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de 
 *  horas trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 
 *  por hora. Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento armazenando-o 
 *  na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00.
 *   No final do processamento imprimir o sal�rio total e o sal�rio excedente.
 */



import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float N=0,S=0,E=0,C=0;
		
		System.out.println("Digite o n�mero de horas trabalhadas: ");
		N=read.nextFloat();
		
		S=N*10;
		
		if(N<=50) {
			
			System.out.printf("Seu salario � de %.2f Reais", S);
		}else {
			E=N-50;
			C=E*20;
			S=C+500;
			System.out.printf("Seu salario � de %.2f Reais", S);
		}
		read.close();
	}

}

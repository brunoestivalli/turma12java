/*
 *  Elabore um sistema que leia as variáveis C e N, respectivamente código e número de 
 *  horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 
 *  por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o 
 *  na variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00.
 *   No final do processamento imprimir o salário total e o salário excedente.
 */



import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float N=0,S=0,E=0,C=0;
		
		System.out.println("Digite o número de horas trabalhadas: ");
		N=read.nextFloat();
		
		S=N*10;
		
		if(N<=50) {
			
			System.out.printf("Seu salario é de %.2f Reais", S);
		}else {
			E=N-50;
			C=E*20;
			S=C+500;
			System.out.printf("Seu salario é de %.2f Reais", S);
		}
		read.close();
	}

}

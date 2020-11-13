/*
 * O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a 
 * condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo.
IMC em adultos Condição
Abaixo de 18,5 Abaixo do peso
Entre 18,5 e 25 Peso normal
Entre 25 e 30 Acima do peso
Acima de 30 obeso

 */
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);

		double peso,IMC=0,altura=0;
		
		System.out.println("Digite seu peso");
		peso=read.nextDouble();	
		System.out.println("Digite seu altura");
		altura=read.nextDouble();
		
		IMC=peso/(Math.pow((altura),2));
		
		if(IMC<18.5) {
			System.out.printf("Seu IMC é de %.2f ",IMC);
			System.out.println("\nAbaixo de 18,5 Abaixo do peso");
		}if(IMC>=18.5 && IMC<25) {
			System.out.printf("Seu IMC é de %.2f ",IMC);
			System.out.println("\nEntre 18,5 e 25 Peso normal");
		}if(IMC>=25 && IMC<30) {
			System.out.printf("Seu IMC é de %.2f ",IMC);
			System.out.println("\nEntre 25 e 30 Acima do peso");
		}if(IMC>30) {
			System.out.printf("Seu IMC é de %.2f ",IMC);
			System.out.println("\nAcima de 30 obeso");
		}
	}
}

/*
 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento
 *  diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
 *   regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo 
 *   excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) 
 *   e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
 *    da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
 */


import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		float P=0, E=0;
		
		System.out.println("Digite a quantidade(kg) do Tomate?");
		P=read.nextFloat();
		
		if(P<=50) {
			System.out.printf("A quantidade de Tomates é de: %.2f Kg",P);
			System.out.println("\nQuantidade de tomates permitida, não terá aplicação de multa");
		}else {
			E=P-50;
			System.out.printf("A multa a pagar é de %.2f Reais",E*4);
			read.close();
		}
		
	}

}

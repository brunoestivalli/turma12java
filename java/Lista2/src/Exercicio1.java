/*
 * Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento
 *  di�rio de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
 *   regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo 
 *   excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) 
 *   e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor
 *    da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
 */


import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		float P=0, E=0;
		
		System.out.println("Digite a quantidade(kg) do Tomate?");
		P=read.nextFloat();
		
		if(P<=50) {
			System.out.printf("A quantidade de Tomates � de: %.2f Kg",P);
			System.out.println("\nQuantidade de tomates permitida, n�o ter� aplica��o de multa");
		}else {
			E=P-50;
			System.out.printf("A multa a pagar � de %.2f Reais",E*4);
			read.close();
		}
		
	}

}

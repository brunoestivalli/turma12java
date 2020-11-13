/*
 * 	Elabore um programa que calcule o que deve ser pago por um produto, considerando o pre�o normal de etiqueta e a 
 * escolha da condi��o de pagamento. Utilize os c�digos da tabela a seguir para ler qual a condi��o de pagamento escolhida e efetuar o c�lculo adequado.
C�digo Condi��o de pagamento
1 � vista em dinheiro ou cheque, recebe 20% de desconto
2 � vista no cart�o de cr�dito, recebe 15% de desconto
3 Em duas vezes, pre�o normal de etiqueta sem juros
4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%

 */


import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int pagamento;
		double preco=0,Produto;
		String vetor[]= {"\n1-� vista em dinheiro ou cheque, recebe 20% de desconto","\n2-� vista no cart�o de cr�dito, recebe 15% de desconto","\n3-Em duas vezes, pre�o normal de etiqueta sem juros ,3\n4-Em tr�s vezes, pre�o normal de etiqueta mais juros de 10% "};
		
		
		System.out.println("Escreva o pre�o do produto: ");
		Produto= read.nextDouble();
		
		for(String opcoes: vetor) {
		System.out.println(opcoes);
		
	}
		System.out.println("\n\nEscolha a forma de pagamento(1/2/3/4): ");
		pagamento=read.nextInt();

		if(pagamento==1) {
			preco=Produto-(Produto*20)/100;
			System.out.printf("O valor a pagar � de %.2f reais",preco);
		}else if(pagamento==2) {
			preco=Produto-(Produto*15)/100;
			System.out.printf("O valor a pagar � de %.2f reais",preco);
		}else if(pagamento==3) {
			System.out.printf("O valor a pagar � de %.2f reais",Produto);
			System.out.printf("\nO pre�o a pagar em 2 vezes � de %.2f reais",(Produto/2));
		}else if(pagamento==4) {
			preco=Produto+(Produto*10)/100;
			System.out.printf("O valor a pagar � de %.2f reais",preco);
			System.out.printf("\nO pre�o a pagar em 3 vezes � de %.2f reais",(preco/3));
		}
		
	}
	
}

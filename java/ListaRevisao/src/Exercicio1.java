/*
 * 	Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a 
 * escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
Código Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 20% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em três vezes, preço normal de etiqueta mais juros de 10%

 */


import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int pagamento;
		double preco=0,Produto;
		String vetor[]= {"\n1-À vista em dinheiro ou cheque, recebe 20% de desconto","\n2-À vista no cartão de crédito, recebe 15% de desconto","\n3-Em duas vezes, preço normal de etiqueta sem juros ,3\n4-Em três vezes, preço normal de etiqueta mais juros de 10% "};
		
		
		System.out.println("Escreva o preço do produto: ");
		Produto= read.nextDouble();
		
		for(String opcoes: vetor) {
		System.out.println(opcoes);
		
	}
		System.out.println("\n\nEscolha a forma de pagamento(1/2/3/4): ");
		pagamento=read.nextInt();

		if(pagamento==1) {
			preco=Produto-(Produto*20)/100;
			System.out.printf("O valor a pagar é de %.2f reais",preco);
		}else if(pagamento==2) {
			preco=Produto-(Produto*15)/100;
			System.out.printf("O valor a pagar é de %.2f reais",preco);
		}else if(pagamento==3) {
			System.out.printf("O valor a pagar é de %.2f reais",Produto);
			System.out.printf("\nO preço a pagar em 2 vezes é de %.2f reais",(Produto/2));
		}else if(pagamento==4) {
			preco=Produto+(Produto*10)/100;
			System.out.printf("O valor a pagar é de %.2f reais",preco);
			System.out.printf("\nO preço a pagar em 3 vezes é de %.2f reais",(preco/3));
		}
		
	}
	
}

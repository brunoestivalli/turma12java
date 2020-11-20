/*
 * Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor. Considere que cada 
 * instância da classe Fornecedor tem, para além dos atributos que caracterizam a classe Pessoa, os atributos valorCredito 
 * (correspondente ao crédito máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com o fornecedor). 
 * Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores, um método obterSaldo() que devolve 
 * a diferença entre os valores dos atributos valorCredito e valorDivida. Depois de implementada a classe Fornecedor, crie um 
 * programa de teste adequado que lhe permita verificar o funcionamento dos métodos implementados na classe Fornecedor e os 
 * herdados da classe Pessoa.
 */

package Programas;

import java.util.Scanner;

import Classes.Fornecedor;

public class TesteFornecedor {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		double valor1;
		double valor2;
		
		Fornecedor fornecedor = new Fornecedor(null, null, null, 0, 0);
		
		System.out.println("Escreva valor do credito: ");
		valor1=read.nextDouble();
		
		System.out.println("Escreva valor do debito");
		valor2=read.nextDouble();
		
		System.out.println(fornecedor.obterSaldo(valor1,valor2));

	}


	



}

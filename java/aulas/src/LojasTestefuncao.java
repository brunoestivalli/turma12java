import java.util.Scanner;

import testesFuncao.Pessoa;

public class LojasTestefuncao {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		Pessoa clienteBru=new Pessoa();
		Produto Produto1 =new Produto();
		
		System.out.println("LOJA BRUNO");
		
		System.out.println("Digite o nome do produto: ");
		Produto1.nome=read.next();

	}

}

import java.util.Scanner;
public class MeuNome {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int anoNasc;
		int idade;
		String nome;
		double salario;
		
		System.out.println("Digite o nome: ");
		nome=read.next();
		
		System.out.println("Digite o ano do seu nascimento: ");
		anoNasc=read.nextInt();
		
		System.out.println("Digite o sal�rio: ");
		salario=read.nextDouble();
		
		System.out.println(nome);
		System.out.println(anoNasc);
		System.out.println(salario);
		
		idade=2020-anoNasc;
		System.out.println( idade);
		
		
		
		System.out.printf("meu nome �: %s , minha idade �: %d e meu salario �: %.2f",nome,idade,salario);
		read.close();
		
		
	}

}

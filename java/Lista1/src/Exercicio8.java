import java.util.Scanner;
public class Exercicio8 {
	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);
		double preco, Pordist, Porimpos, Total;
		System.out.println("Digite o custo da Fábrica: ");
		preco=read.nextDouble();
		
		Pordist=preco*(28.0/100);
		Porimpos=preco*(45.0/100);
		Total=preco+Pordist+Porimpos;
		
		System.out.println("O preço final a pagar de: "+Total);
		read.close();
	}

}

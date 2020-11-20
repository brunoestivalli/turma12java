package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.Funcionario;
import Classes.Terceiro;

public class CadFunc {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		List <Funcionario> cadastro = new ArrayList<>(); //INTERFACE
		
		
		System.out.println("Digite o numero de funcionarios para cadastro: ");
		numero = leia.nextInt();
		for (int x =1 ; x<=numero; x++) {
			System.out.println("Empregado "+x);
			System.out.print("Terceiro S/N: ");
			char resposta = leia.next().toUpperCase().charAt(0);
			System.out.println("Digite o codigo do func:");
			String codigo = leia.next();
			System.out.println("Digite as horas:");
			double horas = leia.nextDouble();
			System.out.println("Digite o valor hora:");
			double valorHora = leia.nextDouble();
			if (resposta =='S') {
				System.out.println("Digite o valor adicional deste terceiro:");
				double adicional = leia.nextDouble();
				cadastro.add(new Terceiro(codigo, horas, valorHora, adicional)); //POLIMORFISMO
				
			} else
			{
				cadastro.add(new Funcionario(codigo, horas, valorHora));
			}
			
		}
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO");
		for (Funcionario func: cadastro) {
			System.out.println(func.getCod() + " - " +String.format("%.2f",func.pagamentoSalario()));
		}
		
		
		
	}
}
package Aplicacao;
import java.util.Scanner;

import Entidades.Aves;
import Entidades.Cachorro;
import Entidades.Entrega;
import Entidades.Pessoa;
import Entidades.Pessoa;

public class PetBet {

	public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);
		Pessoa cliente1=new Pessoa("Bruno", "Estivalli");
		Pessoa cliente2=new Pessoa("Ricardo");
		Cachorro dog1=new Cachorro("Pintcher");
		Cachorro dog2=new Cachorro("Pitbull");
		Aves ave1=new Aves("Verde", "Curvado", "Arara");
		Entrega entrega=new Entrega();
		
		System.out.println(cliente1.nome);
		System.out.println(cliente1.sobrenome);
		System.out.println(cliente2.nome);
		
		
		System.out.println("Digite sobrenome");
		cliente1.sobrenome=read.nextLine();
		System.out.println("Digite o ano de nascimento:");
		cliente1.anoNascimento=read.nextInt();
		System.out.println("DIGITE M/F/O");
		cliente1.genero=read.next().toUpperCase().charAt(0);
		System.out.println(cliente1.nome);
		System.out.println(cliente1.sobrenome);
		System.out.print("sua idade é de ");
		cliente1.idade();
		System.out.println(cliente1.idade);
		System.out.println("Informando o ano");
		cliente1.idade(2020);
		System.out.println(cliente1.idade);
		System.out.println(cliente1.PegaIdade(2050));
		System.out.println(cliente1.seuGenero());
	
		
	}
	
	

}

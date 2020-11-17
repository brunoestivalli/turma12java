
import java.util.Scanner;

public class Exercicio1Cliente {
	public static void main(String[] args) {
	Scanner read=new Scanner(System.in);
	Cliente cliente=new Cliente("Bruno","50169454623", 20, 2000);
	System.out.print("Nome do Cliente: ");
	System.out.println(cliente.nome);
	System.out.print("CPF do Cliente: ");
	System.out.println(cliente.CPF);
	System.out.print("Idade do Cliente: ");
	System.out.println(cliente.idade);
	System.out.print("Ano de nascimento do Cliente: ");
	System.out.println(cliente.anoNascimento);
	
	}
}

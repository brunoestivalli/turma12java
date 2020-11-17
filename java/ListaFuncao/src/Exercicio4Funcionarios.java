import java.util.Scanner;
public class Exercicio4Funcionarios {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		Funcionarios funcionario=new Funcionarios("Bruno", 75, "Engenheiro",8.3);
		
		System.out.print("Nome do Funcionario: ");
		System.out.println(funcionario.NomeFuncionario);
		System.out.print("Id do Funcionario: ");
		System.out.println(funcionario.numeroFuncionario);
		System.out.print("Profissão do Funcionario: ");
		System.out.println(funcionario.trabalho);
		System.out.print("Horas de Turno do Funcionario: ");
		System.out.println(funcionario.horaTurno);
		
		
	}
}

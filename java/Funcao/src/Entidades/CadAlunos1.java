package Entidades;
import java.util.Scanner;
public class CadAlunos1 {
	public static void main(String[] agrs) {
		Scanner read=new Scanner(System.in);
		
		String nome;
		int matricula;
		
		System.out.println("Digite o número da matrícula: ");
		matricula=read.nextInt();
		System.out.println("Escreva o nome: ");
		nome=read.next();
		
		Aluno aluno1=new Aluno(matricula,nome);

		System.out.println("Escolha A-ativo e qualquer outra letra para não ativo: ");
		aluno1.setGenero(read.next().toUpperCase().charAt(0));
		aluno1.obterGenero();
		System.out.println(aluno1.getGenero());
		System.out.println("Digite o ano de nascimento: ");
		aluno1.setAnoNascimento(read.nextInt());
		aluno1.idade();
		System.out.printf("Bem-vindo %s %s! ",
				aluno1.obterGenero(), aluno1.getNome());
		
		if (aluno1.idade() < 13) {
			System.out.println("Você está matriculado no ensino fundamental");
		} else if (aluno1.idade() >= 13 && aluno1.idade() <= 17) {
			System.out.println("Você está matriculado no ensino médio");
		} else if (aluno1.idade() > 17) {
			System.out.println("Você está matriculado no ensino superior");
		}
		
		
		
		
		
	}

}

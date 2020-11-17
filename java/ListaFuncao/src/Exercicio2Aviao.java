import java.util.Scanner;
public class Exercicio2Aviao {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		Aviao aviao= new Aviao("Bruno", "Eduardo",45,"Estivalli's airline");
		
		System.out.print("Nome do piloto: ");
		System.out.println(aviao.nomePiloto);
		System.out.print("Nome do Copiloto: ");
		System.out.println(aviao.Copiloto);
		System.out.print("Número de lugares: ");
		System.out.println(aviao.numeroLugares);
		System.out.print("Companhia: ");
		System.out.println(aviao.companhia);
		

	}

}

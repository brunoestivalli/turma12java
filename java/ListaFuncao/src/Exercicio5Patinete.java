import java.util.Scanner;
public class Exercicio5Patinete {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		Patinete patinete= new Patinete(2,95.5,75.6);
		
		System.out.print("Número de rodas: ");
		System.out.println(patinete.Rodas);
		System.out.print("Altura do patinete: ");
		System.out.println(patinete.altura);
		System.out.print("Comprimento do patinete: ");
		System.out.println(patinete.comprimento);
		
			
	}
}

/*
 * Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos

 */

import java.util.Scanner;
public class Exercicio6 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int idadeUsuario;
		System.out.println("Informe a idade do atleta: ");
		idadeUsuario=read.nextInt();
		
		if(idadeUsuario<5) {
			System.out.println("Idade invalida");
		}
		else if(idadeUsuario>=5 && idadeUsuario<=7) {
			System.out.println("Infantil A de 5 a 7 anos");
		}
		else if(idadeUsuario>=8 && idadeUsuario<=11) {
			System.out.println("Infantil B de 8 a 11 anos");
		}
		else if(idadeUsuario>=12 && idadeUsuario<=13) {
			System.out.println("Juvenil A de 12 a 13 anos");
		}
		else if(idadeUsuario>=14 && idadeUsuario<=17) {
			System.out.println("Juvenil B de 14 a 17 anos");
		}
		else {
			System.out.println("Adultos, Maiores de 18 anos");
		}
	}
}

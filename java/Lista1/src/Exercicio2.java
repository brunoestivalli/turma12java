import java.util.Scanner;
public class Exercicio2 {
public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);
		
		int dias;
	
		System.out.println("Escreva quantos anos você tem em dias: ");
		dias=read.nextInt();
		
		System.out.println("--------------------------------------------------------");
		System.out.println((dias/365)+((dias % 365)/30) +((dias%365)%30)+" dias");
		
		read.close();
		
	}
		


}

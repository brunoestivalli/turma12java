import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		int A,B,C,D,R,S;
		System.out.println("Olá, digite o primeiro Número(A): ");
		A=read.nextInt();
		System.out.println("Digite agora o segundo Número(B): ");
		B=read.nextInt();
		System.out.println("Para finalizar, digite o terceiro número(C) ");
		C=read.nextInt();
		
		System.out.println("Os números A, equivale a: "+A);
		System.out.println("Os números A, equivale a: "+B);
		System.out.println("Os números A, equivale a: "+C);
		
		System.out.println("--------------------------");
		
		R=(A+B)^2;
		System.out.println("O número R é: "+R);
		
		S=(B+C)^2;
		System.out.println("O número S é: "+S);
		
		D=(R+S)/2;
		System.out.println("O número D é: "+D);
		
		
		read.close();
	}

}

import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		int A,B,C,D,R,S;
		System.out.println("Ol�, digite o primeiro N�mero(A): ");
		A=read.nextInt();
		System.out.println("Digite agora o segundo N�mero(B): ");
		B=read.nextInt();
		System.out.println("Para finalizar, digite o terceiro n�mero(C) ");
		C=read.nextInt();
		
		System.out.println("Os n�meros A, equivale a: "+A);
		System.out.println("Os n�meros A, equivale a: "+B);
		System.out.println("Os n�meros A, equivale a: "+C);
		
		System.out.println("--------------------------");
		
		R=(A+B)^2;
		System.out.println("O n�mero R �: "+R);
		
		S=(B+C)^2;
		System.out.println("O n�mero S �: "+S);
		
		D=(R+S)/2;
		System.out.println("O n�mero D �: "+D);
		
		
		read.close();
	}

}

import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		double nota1,nota2,nota3, mediaFinal, p1,p2,p3;
		
		p1=2;
		p2=3;
		p3=5;
		
		System.out.println("Digite a primeira nota: ");
		nota1=read.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2=read.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota3=read.nextDouble();
		
		mediaFinal=((nota1*p1)+(nota2*p2)+(nota3*p3))/(p1+p2+p3);
		System.out.println("Sua Média final é: "+mediaFinal);
		
		read.close();
		
		
				
	}

}

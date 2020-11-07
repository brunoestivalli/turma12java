import java.util.Scanner;
public class Exercicio6 {
	public static void main(String[] args) {
	Scanner read =new Scanner(System.in);
	double X1,Y1,X2,Y2,d;
	System.out.println("Digite ar coordenadas X1 do ponto P: ");
	X1=read.nextDouble();
	
	System.out.println("Digite ar coordenadas Y1 do ponto P: ");
	Y1=read.nextDouble();
	
	System.out.println("Digite ar coordenadas X2 do ponto P: ");
	X2=read.nextDouble();
	
	System.out.println("Digite ar coordenadas Y2 do ponto P: ");
	Y2=read.nextDouble();
	
	d=((X2-X1)+(Y2-Y1));
	System.out.println(d);
	
	read.close();
	
	}
}

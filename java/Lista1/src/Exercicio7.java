import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);
		double  a, b, c, d, ex, f, x, y;
		
		System.out.println("Valor a: ");
		a=read.nextDouble();
		
		System.out.println("Valor b: ");
		b=read.nextDouble();
		
		System.out.println("Valor c: ");
		c=read.nextDouble();
		
		System.out.println("Valor d: ");
		d=read.nextDouble();
		
		System.out.println("Valor ex: ");
		ex=read.nextDouble();
		
		System.out.println("Valor f: ");
		f=read.nextDouble();
		
		x=((c*ex)-(b*f))/((a*ex)-(b*d));
		y = ((a*f)-(c*d))/((a*ex)-(b*d));
		
		System.out.println("Resultados: ");
		System.out.println("Valor de X: "+ x);
		System.out.println("Valor de Y" + y);
		
		
		read.close();
	}

}

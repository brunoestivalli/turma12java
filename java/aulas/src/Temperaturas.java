import java.util.Scanner;

public class Temperaturas {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		
		double f;
		double c;
		
		System.out.println("Digite uma temperatura em Graus Celsius: ");
		c=read.nextDouble();
		
		f=(c*1.8)+32;
		System.out.println("Sua temp em Fahrenheit é de:"+f+"°F");
				
		
	}
}

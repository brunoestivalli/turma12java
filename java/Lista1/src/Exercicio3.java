import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner read= new Scanner(System.in);
		
		double duracaoSeg;
	
		System.out.println("Tempo de duração do evento em segundos: ");
		duracaoSeg=read.nextDouble();
		
		System.out.printf("%.2f horas, %.2f minutos, %.2f segundos ",(duracaoSeg/3600),((duracaoSeg%3600)/60),
		((duracaoSeg%3600)%60));
		
		read.close();
	}
	
	

}

import java.util.Scanner;
public class Exercicio3 {
public static void main(String[] args) {
		
		Scanner read= new Scanner(System.in);
		
		int duracaoSeg;
	
		System.out.println("Tempo de duração do evento em segundos: ");
		duracaoSeg=read.nextInt();
		
		System.out.printf("%d horas, %d minutos, %d segundos ",(duracaoSeg/3600),((duracaoSeg%3600)/60),
		((duracaoSeg%3600)%60));
		
		read.close();
	}

}

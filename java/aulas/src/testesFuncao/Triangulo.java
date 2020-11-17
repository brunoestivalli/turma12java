package testesFuncao;
import java.util.Scanner;
public class Triangulo {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		Trianguloclasse t3 = new Trianguloclasse(); // objeto triangulo
		Trianguloclasse t4 = new Trianguloclasse();
		int base1=0,base2=0,altura1=0,altura2=0,area1=0,area2=0;
		
		
		System.out.println("Digite a altura do triângulo 1: ");
		altura1=read.nextInt();
		while(altura1<=0) {
			System.out.println("Não é possivel usar medidas negativas ou zero, tente novamente");
			System.out.println("Digite a altura do triângulo 1: ");
			altura1=read.nextInt();
		}
	
		System.out.println("Digite a base do triângulo 2: ");
		base1=read.nextInt();
		while(base1<=0) {
			System.out.println("Não é possivel usar medidas negativas ou zero, tente novamente");
			System.out.println("Digite a base do triângulo 2: ");
			base1=read.nextInt();
		}
		
		System.out.println("Digite a altura do triângulo 2: ");
		altura2=read.nextInt();
		while(altura2<=0) {
			System.out.println("Não é possivel usar medidas negativas ou zero, tente novamente");
			System.out.println("Digite a altura do triângulo 2: ");
			altura2=read.nextInt();
		}
	
		System.out.println("Digite a base do triângulo 2: ");
		base2=read.nextInt();
		while(base2<=0) {
			System.out.println("Não é possivel usar medidas negativas ou zero, tente novamente");
			System.out.println("Digite a base do triângulo 2: ");
			base2=read.nextInt();
		}
		
		System.out.println("Digite a altura do triângulo 1: ");
		t3.altura=read.nextDouble();
		while(t3.altura<=0) {
			System.out.println("Não é possivel usar medidas negativas ou zero, tente novamente");
			System.out.println("Digite a altura do triângulo 1: ");
			t3.altura=read.nextInt();
		}
	
		System.out.println("Digite a base do triângulo 2: ");
		t3.base=read.nextDouble();
		while(t3.base<=0) {
			System.out.println("Não é possivel usar medidas negativas ou zero, tente novamente");
			System.out.println("Digite a base do triângulo 2: ");
			t3.base=read.nextDouble();
		}
		
		
		
		
		
		area1=((base1*altura1)/2);
		area2=((base2*altura2)/2);
		t3.area=((t3.altura*t3.base)/2);
		
			if(area1>area2 || area1>t3.area) {
				
				System.out.printf("A altura do triângulo 1 é de: %d",altura1);
				System.out.println('\n');
				System.out.printf("A altura do base 1 é de: %d",base1);
				System.out.println('\n');
				System.out.printf("A area do triângulo 1 é de: %d",area1);
				System.out.println('\n');
				System.out.print("\n");
				System.out.printf("A altura do triângulo 2 é de: %d",altura2);
				System.out.println('\n');
				System.out.printf("A altura do base 2 é de: %d",base2);
				System.out.println('\n');
				System.out.printf("A area do triângulo 2 é de: %d",area2);
				System.out.println('\n');
				System.out.println('\n');
				System.out.println("O área do triângulo 2 é maior");
				System.out.printf("A altura do triângulo 3 é de: %f",t3.altura);
				System.out.println('\n');
				System.out.printf("A altura do base 1 é de: %f",t3.base);
				System.out.println('\n');
				System.out.printf("A area do triângulo 1 é de: %f",t3.area);
	
	
			}else if(area2>area1) {
				System.out.printf("A altura do triângulo 1 é de: %d",altura1);
				System.out.println('\n');
				System.out.printf("A altura do base 1 é de: %d",base1);
				System.out.println('\n');
				System.out.printf("A area do triângulo 1 é de: %d",area1);
				System.out.println('\n');
				System.out.print("\n");
				System.out.printf("A altura do triângulo 2 é de: %d",altura2);
				System.out.println('\n');
				System.out.printf("A altura do base 2 é de: %d",base2);
				System.out.println('\n');
				System.out.printf("A area do triângulo 2 é de: %d",area2);
				System.out.println('\n');
				System.out.println('\n');
				System.out.println("O área do triângulo 2 é maior");
	
			
		}
			
	}

}

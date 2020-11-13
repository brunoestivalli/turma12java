/*
 * Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos. Em seguida o programa deve fazer a 
 * multiplicação do vetor pelas colunas da matriz.
 */
import java.util.Random;
import java.util.Scanner;
public class Exercicio6 {
	public static void main(String[] args) {
	Scanner read=new Scanner(System.in);
	Random sdsd=new Random();
			 int linha=3;
			 int coluna=3;
			
			int xuxu[]=new int [3];
			int z=0,x= 0, y=0;
			
			int N1[][]= new int [3][3];
			
			System.out.println("Vetor de 3 valores\n\n");
			
			for(z=0;z<3;z++){
				xuxu[z]=sdsd.nextInt(9);
				System.out.print("\n "+xuxu[z]);
			}
			System.out.println("\n\n");
			System.out.println("Matriz N1 \n");
			for(x=0;x<linha;x++){
				System.out.print("\n");
				for(y=0; y<coluna;y++){
					
					N1[x][y]=sdsd.nextInt(9);
			
					System.out.print("\t "+N1[x][y]);
					
				}
			}
			System.out.print("\n\nVetor x Coluna");
			for(x=0;x<linha;x++){
				System.out.print("\n");
				for(y=0; y<coluna;y++){
					System.out.print("\t "+xuxu[y]*N1[x][y]);
				}
			}
		}



	

	
	
}

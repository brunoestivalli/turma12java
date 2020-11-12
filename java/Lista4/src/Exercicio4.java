/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores 
 * dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
 */
import java.util.Random;
import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		Random random=new Random();
		
		int linha=3;
		int coluna=3;
		int matriz[][]=new int [linha][coluna];
		int x= 0, y=0,somaDiagonal=0;

		for(x=0;x<linha;x++){
			for(y=0; y<coluna;y++){
				matriz[x][y]=random.nextInt(9);
				if(x==y){
					somaDiagonal=somaDiagonal+matriz[x][y];
						}
					}
				}
				for(x=0;x<linha;x++){
					for(y=0; y<coluna;y++){
						System.out.print(" "+matriz[x][y]);
						
					}System.out.println("\t");
					
				}System.out.print("o resultado da diagonal principal é de: "+somaDiagonal);
			}
		}

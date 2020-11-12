package desafioProgramador;
import java.util.Scanner;
public class Desafio2 {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		String times[]= {"Corinthins","Palmeiras","Santos","SPFC"};
		int Pontos[][]=new int[4][4];
		int x=0;
		int coluna=0;
		int linha=0;
		char opcao;
		int pontuacao[]=new int[4];
	
		System.out.println("Times\n------");
		for(x=0;x<4;x++) {
			System.out.println(times[x]);
		}
		//System.out.println("\nEscolha um time de 0 a 3: ");
		//indice=read.nextInt();
		//for(x=0;x<4;x++) {
			//if(indice==x) {
				
				//System.out.println(Cod[x]+"\t\t\t"+times[x]);	
				
			//}
			
			for(coluna=0;coluna<4;coluna++) {
				System.out.println("rodada "+(coluna+1));
				
				for(linha=0;linha<4;linha++) {
					
				
					System.out.println(times[linha]);
					System.out.print("G-ganhou, E-empatou, P-perdeu:");
					opcao=read.next().toUpperCase().charAt(0);
					if(opcao=='G') {
						Pontos[linha][coluna]=3;
					}else if(opcao=='E') {
						Pontos[linha][coluna]=1;
					}else if(opcao=='P') {
						Pontos[linha][coluna]=0;
					}else {
						System.out.println("Vc não escolheu direito, perdeu");
						Pontos[linha][coluna]=0;
					}
				
					pontuacao[linha]=pontuacao[linha]+Pontos[linha][coluna];
					
				}	
				
		}
			
			System.out.println("\n\nCorinthians \t Palmeiras \t Santos \t SPFC");
			for(coluna=0;coluna<4;coluna++) {
				System.out.print("\n");
				for(linha=0;linha<4;linha++) {
					
					System.out.print(Pontos[linha][coluna]+"\t\t");
				}
			}
			System.out.println("\n\n");
			for(linha=0;linha<4;linha++) {
				System.out.println(times[linha]+" - "+pontuacao[linha]);
			}
		
	}
}


package desafioProgramador;
import java.util.Scanner;

public class Desafio1{
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		//caracter = teclado.next().charAt(0);
		//next().toUpperCase(); pra transformar letra em maiusculo
		// e = &&
		//ou = ||
		//vetor  String nomes[] = new String[10]; VETOR
		//		String produtos[] = {"Camisa","Boné"...};
		//int precos[]=new int[3];
		
		String nomes[] = {"Ana veronica Nascimento cruz","Bruno Estivalli Vicente","Bruno Henrique Moraes Santos",
				"Daniel Ferreira","Dayane de Oliveira","Denis Vinicius Bolla da Silva","Diego  Joaquim Silva","Erick Alan",
				"Everson Silva","Gabriel Enrique Cabral Silva","Guilherme Alex","Guilherme Fidelis Pereira",
				"Gustavo Miquéias Lopes Santana","Isac Cordeiro de Oliveira","Iuri Garcia Nunes",
				"Jenifer Lima Placido","Jéssica Cristiane","Joao Pedro Sena","Larissa Moraes Ribeiro",
				"Leonardo de Moraes Magalhães","Lucas Santos Gonçalves","Mariana de C. Antunes Oliveira",
				"Patricia da Silva Machado","Paula Leticia","Raul Fernandes","RICARDO MAGALHAES FINKELSTEIN",
				"Thiago dos Anjos","Vitória Gonçalves de Freitas","William Xavier"}	;
		String sexo [] = {"feminino", "masculino", "masculino", "masculino", "feminino", "masculino", "masculino", "masculino", "masculino", "masculino", "masculino", "masculino", "masculino", "masculino", "masculino", "femino",
				"feminino","masculino", "feminino", "masculino", "masculino", "feminino", "feminino", "femino", "masculino", "masculino","masculino", "femino", "masculino"};
		boolean masculinos[] = {false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,false,false,true,false,true,true,false,false,false,true,true,true,false,true};
		
		String codigos[]=new String[29];
		int grupo=1,tamanho=0;
		
		int x=0;
		System.out.println("Codigos \t nomes");
		
		for(x=0;x<29;x++) {
			codigos[x]= "C - "+x;
		}
		for(x=0;x<29;x++) {
			System.out.println(codigos[x]+ "\t"+nomes[x]);
		}
		System.out.println("Digite o valor desejado por grupo: ");
		tamanho = leia.nextInt();
		
		System.out.println("Codigos \t nomes \t\t\t\t grupos");
		
		for(x=0;x<29;x++) {
			System.out.println(codigos[x]+ "\t"+nomes[x]+"\t\t"+grupo);
			if((x+1)%tamanho==0) {
				grupo++;
			}
		}
		System.out.println("codigos \t\tsexo\t\tnomes");
		int homens=0;
		for(x=0;x<29;x++){
			if(masculinos[x]) {
				System.out.printf("\n %s  \t\t M \t\t %s ",codigos[x],nomes[x]);
				homens++;
				
			}
		}System.out.printf("\nO total de homens na sala é de: "+ homens);
			
			int mulheres=0;
			for(x=0;x<29;x++){
				if(masculinos[x]==false) {
					System.out.printf("\n %s  \t\t F \t\t %s ",codigos[x],nomes[x]);
					mulheres++;
					
				
			
			}
				}System.out.printf("\nO total de homens na sala é de: "+ mulheres);
		
	}
}












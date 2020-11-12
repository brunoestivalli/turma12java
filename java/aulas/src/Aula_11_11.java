import java.util.Scanner;
import java.util.Locale;
public class Aula_11_11 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		String nomes[] = {"Ana veronica Nascimento cruz","Bruno Estivalli Vicente","Bruno Henrique Moraes Santos",
				"Daniel Ferreira","Dayane de Oliveira","Denis Vinicius Bolla da Silva","Diego  Joaquim Silva","Erick Alan",
				"Everson Silva","Gabriel Enrique Cabral Silva","Guilherme Alex","Guilherme Fidelis Pereira",
				"Gustavo Miquéias Lopes Santana","Isac Cordeiro de Oliveira","Iuri Garcia Nunes",
				"Jenifer Lima Placido","Jéssica Cristiane","Joao Pedro Sena","Larissa Moraes Ribeiro",
				"Leonardo de Moraes Magalhães","Lucas Santos Gonçalves","Mariana de C. Antunes Oliveira",
				"Patricia da Silva Machado","Paula Leticia","Raul Fernandes","RICARDO MAGALHAES FINKELSTEIN",
				"Thiago dos Anjos","Vitória Gonçalves de Freitas","William Xavier"}	;
		
		int notas[]=new int[29];
		int aluno=0;
		int x=0;
		String matriculas[]=new String[29];
		int matriz[][]=new int[2][29];
		String Matricula;
		int indice=0;
		int numeMatricula=0;
		int GIRO=0;
		char Opcao=0;
		
		System.out.println("CÓDIGOS \t\t NOMES\n");
		do {
			for(x=0;x<29;x++) {
				
				if(x<9) {
					matriculas[x]="C-"+(x+1);
				}else {
					matriculas[x]="C-"+(x+1);
				}
					numeMatricula++;
					System.out.println(matriculas[x]+"\t\t"+nomes[x]);
					
					if(GIRO>0) {
						System.out.println("Alunos com nota: ");
						System.out.println("C \t NOME \t\t\t NOTAS");
						for (x=0;x<29;x++) {
							//if(x<9) {
								matriculas[x]= "C-0"+(x);
							//}else {
								//matriculas[x]="C-"+(x+1);
							//}
							//numeMatricula++;
						}
					}
			}
			
			
			
		
	
			System.out.println("\nDigite o codigo do aluno: ");
			Matricula=read.next().toUpperCase();
			for(x=0;x<29;x++) {
				if(Matricula.equals(matriculas[x])) {
					indice=x;
				}
			}		
			System.out.println("Códigos \t\t Nomes");
			System.out.println(matriculas[indice]+"\t\t\t"+nomes[indice]);			
			System.out.println("\nDigite a nota do aluno(a): ");
			notas[indice]=read.nextInt();
			System.out.println("Deseja continuar S OU N ? " );
			
			System.out.println();
		}while(Opcao=='S');
				
		System.out.println(nomes[indice]+notas[indice]);
					
				 
		
			
		
	
	}	
}

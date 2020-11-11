/*
 *  A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e
 *   número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00. 
 */
import java.util.Scanner;
public class Exercicio1For {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		float Salario=0,mediaSalario=0,mediaNumFilhos=0,maiorSal=0,percentualSalario=0,xHab=0,TotalSalario=0,MenorSal=0;
		int NumeroFilhos=0,TotalFilhos=0, Participantes=0;
		
		System.out.println("Digite o número de Participantes: ");
		Participantes=read.nextInt();
		for(xHab=0;xHab<Participantes;xHab++) {
			System.out.println("Digite seu salário: ");
			Salario=read.nextFloat();
			TotalSalario=TotalSalario+Salario;
			if(Salario<100) {
				MenorSal=MenorSal+1;
				percentualSalario=(MenorSal/Participantes)*100;
			}
			
			
			System.out.println("Digite quantos filhos você tem: ");
			NumeroFilhos=read.nextInt();
			TotalFilhos=TotalFilhos+NumeroFilhos;
			
		
			if(maiorSal<Salario) {
				maiorSal=Salario;
			}
		}
		mediaSalario=(TotalSalario/Participantes);
		System.out.printf("A média Salarial é de: %.2f reais", mediaSalario);
		
		mediaNumFilhos=(TotalFilhos/Participantes);
		System.out.println("\nA média de filhos é de: "+mediaNumFilhos);
		
		System.out.printf("O maior Salário é de: %.2f reais",maiorSal);
		
		System.out.printf("\nO percentual de pessoas com salario menores que 100 reais é de: %.2f",percentualSalario);
		System.out.println(" %");
		
		

		
		
	}
}

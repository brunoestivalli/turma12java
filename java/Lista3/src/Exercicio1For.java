/*
 *  A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o sal�rio e
 *   n�mero de filhos. A prefeitura deseja saber:  
a) m�dia do sal�rio da popula��o;
b) m�dia do n�mero de filhos;
c) maior sal�rio;
d) percentual de pessoas com sal�rio at� R$100,00. 
 */
import java.util.Scanner;
public class Exercicio1For {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		float Salario=0,mediaSalario=0,mediaNumFilhos=0,maiorSal=0,percentualSalario=0,xHab=0,TotalSalario=0,MenorSal=0;
		int NumeroFilhos=0,TotalFilhos=0, Participantes=0;
		
		System.out.println("Digite o n�mero de Participantes: ");
		Participantes=read.nextInt();
		for(xHab=0;xHab<Participantes;xHab++) {
			System.out.println("Digite seu sal�rio: ");
			Salario=read.nextFloat();
			TotalSalario=TotalSalario+Salario;
			if(Salario<100) {
				MenorSal=MenorSal+1;
				percentualSalario=(MenorSal/Participantes)*100;
			}
			
			
			System.out.println("Digite quantos filhos voc� tem: ");
			NumeroFilhos=read.nextInt();
			TotalFilhos=TotalFilhos+NumeroFilhos;
			
		
			if(maiorSal<Salario) {
				maiorSal=Salario;
			}
		}
		mediaSalario=(TotalSalario/Participantes);
		System.out.printf("A m�dia Salarial � de: %.2f reais", mediaSalario);
		
		mediaNumFilhos=(TotalFilhos/Participantes);
		System.out.println("\nA m�dia de filhos � de: "+mediaNumFilhos);
		
		System.out.printf("O maior Sal�rio � de: %.2f reais",maiorSal);
		
		System.out.printf("\nO percentual de pessoas com salario menores que 100 reais � de: %.2f",percentualSalario);
		System.out.println(" %");
		
		

		
		
	}
}

import java.util.Scanner;
public class Teste1 {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		
		String contas[]= {"Conta Poupança","Conta Corrente","Conta Especial","Conta Empresarial"};
		
		int conta;
		float NumConta=0;
		float Saldo=0;
		double Debito=0,Credito=0;
		int DataAniversario=0;
		float CPF=0;
		int x=0;
		int metodo;
		boolean validacao = true;
		char aniversario;
		
		System.out.println("Digite um número para a conta: ");
		NumConta=leia.nextFloat();
		
		do {
			System.out.println("\n\nInforme sua dia do aniversário da conta: ");
			DataAniversario=leia.nextInt();
			if(DataAniversario<31) {
				validacao=false;
			}else if(DataAniversario>31) {
				validacao=true;
			}
		}while(validacao==true);
		
		System.out.println("Informe seu CPF: ");
		CPF=leia.nextFloat();
		
		System.out.printf("Seu Saldo é de %.2f ",Saldo);
		System.out.println("\n");
		for(x=0;x<4;x++){
			System.out.println((x+1)+" - "+contas[x]);
			
		}
		System.out.println("Escreva um codigo para a utilização da conta(1/2/3/4): ");
		conta=leia.nextInt();
		
		if(conta==1) {
			System.out.println("Métodos ");
			System.out.println("1- Crédito \n 2- Débito");
			System.out.println("Sr(a) gostaria de fazer uma transação com método 1 ou 2 ?");
			metodo=leia.nextInt();
			if(metodo==1) {
				System.out.println("Hoje é o aniversário da conta: ");
				aniversario=leia.next().toUpperCase().charAt(0);
				if(aniversario=='S') {
					System.out.println("Digite o valor a Creditar: ");
					Credito=leia.nextDouble();
					Credito=(Credito+Saldo);
					Credito=Credito+((Credito*0.5)/100);
					System.out.printf("Seu Saldo Atual é de: %.2f reias",Credito);
				}else if(aniversario=='N'){
					Credito=(Credito+Saldo);
					if(Saldo>0) {
						System.out.printf("Seu Saldo Atual é de: %.2f",Credito);
					}
				}

			}else if(metodo==2) {
				System.out.println("Digite o valor a Debitar: ");
				Debito=leia.nextDouble();
				Debito=Credito-Debito;
				
				System.out.println(Debito);
			}
			
			//As outras formas de pagamento
		}
		
	}
}

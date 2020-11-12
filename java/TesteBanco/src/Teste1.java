import java.util.Scanner;
public class Teste1 {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		
		String contas[]= {"Conta Poupança","Conta Corrente","Conta Especial","Conta Empresarial"};
		
		int conta;
		float NumConta=0;
		double Debito=0,Credito=0, Saldo=0;
		int DataAniversario=0;
		float CPF=0;
		int x=0;
		int metodo;
		boolean validacao = true;
		int indice=0;
		char adicionar='S';
		char voltar;
		char verificacao='S';
		int NumTransacoes=1;
		char Transacao='S';
		double Total=0;
		
		//TABELA COM DAS CONTAS
		
		for(String conte: contas) {
			System.out.print((indice+1)+ " - ");
			System.out.println(conte);
			indice++;
		}
		
		//INFORME QUAL CONTA USAR
		
			do {
				do {
					System.out.println("\nEscreva um codigo para a utilização da conta(1/2/3/4): ");
					conta=leia.nextInt();
					}while(conta>5);
				}while(conta<1);
			
		//INFORMAÇÕES BASICAS
			
			if(conta==1) {
				do {
					System.out.println("Digite um número para a conta: ");
					NumConta=leia.nextFloat();
				}while(NumConta<1);
				do {
					
					System.out.println("\nInforme o dia de hoje: ");
					DataAniversario=leia.nextInt();
					if(DataAniversario>=1 && DataAniversario<31) {
						validacao=false;
					}else if(DataAniversario<0 && DataAniversario>31) {
						validacao=true;
					}
					
				}while(validacao==true);
				do {
					System.out.println("Informe seu CPF: ");
					CPF=leia.nextFloat();
				
				}while(CPF<1000000000);
				System.out.printf("Seu Saldo é de %.2f ",Saldo);
				System.out.println("\n");
				
				do{	
					
					while( NumTransacoes<11) {
						
							System.out.println("\nDeseja fazer uma transação ?");
							Transacao=leia.next().toUpperCase().charAt(0);
							if(Transacao=='S') {
							
								System.out.println("Número de Transações "+NumTransacoes++);
								System.out.println("\nMétodos ");
								System.out.println("1- Crédito \n2- Débito");
								System.out.println("Sr(a) gostaria de fazer uma transação com método 1 ou 2 ?");
								metodo=leia.nextInt();
						
								if(metodo==1) {
									if(DataAniversario==11) {
										do {
										System.out.println("\nDigite o valor a Creditar: ");
											Credito=leia.nextDouble();
											Saldo=(Credito+Saldo);
											Saldo=Credito+((Saldo*0.5)/100);
											System.out.printf("Seu Saldo Atual é de: %.2f reias",Saldo);
										}while(Credito<=0);
									}else{
										do {
										System.out.println("\nDigite o valor a Creditar: ");
										Credito=leia.nextDouble();
										Saldo=(Credito+Saldo);
											System.out.printf("Seu Saldo Atual é de: %.2f reais",Saldo);
										}while(Credito<=0);
									}
					
								}else if(metodo==2) {
									do {
										if(Saldo>0) {
											System.out.println("Digite o valor a Retirar: ");
											Debito=leia.nextDouble();
											Saldo=Saldo-Debito;	
											System.out.println("Seu saldo é: "+Saldo+" reais");
										}else if(Saldo==0){
											System.out.printf("Seu saldo é de %.2f reais, impossivel retirada de valor",Saldo);
											System.out.println("\nGostaria de adicionar um valor(S/N): ");
											adicionar=leia.next().toUpperCase().charAt(0);
											verificacao='N';
											if(adicionar=='S') {
												
												if(DataAniversario==11) {
													System.out.println("Digite o valor a Creditar: ");
													Credito=leia.nextDouble();
													Saldo=(Credito+Saldo);
													Saldo=Credito+((Saldo*0.5)/100);
													System.out.printf("Seu Saldo Atual é de: %.2f reias",Saldo);
												}else if(DataAniversario!=11){
													System.out.println("Digite o valor a Creditar: ");
													Credito=leia.nextDouble();
													Saldo=(Credito+Debito);
													System.out.printf("Seu Saldo Atual é de: %.2f reais",Saldo);
													
												}
												
												verificacao='S';
											
											}
										}
								
									}while(verificacao=='N');
										}else if(adicionar=='N') {
											System.out.println("Deseja voltar na parte da seleção de formas de pagamento ?");
											voltar=leia.next().toUpperCase().charAt(0);
										}
									Total=Saldo+Total;
								}else if(Transacao=='N'){
									System.out.println("\nEncerrada a sessão");
									break;
									
								}
						}
					
				}while(Transacao=='S');
				
			}
	}
}


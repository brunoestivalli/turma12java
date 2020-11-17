import java.util.Scanner;

public class Programa_Banco {
	public static void main(String[] args) {

		String contas[] = { "Conta Poupan�a", "Conta Corrente", "Conta Especial", "Conta Empresarial" };
		Scanner leia = new Scanner(System.in);

		int conta;
		float NumConta1 = 0;
		double Debito1 = 0, Credito1 = 0, Saldo1 = 0;
		int DataAniversario1 = 0;
		double CPF1 = 0;
		int x = 0;
		int metodo1;
		boolean validacao = true;
		int indice = 0;
		char adicionar = 'S';
		char voltar;
		char PrinmeiraVerificacao = 'S';
		int NumTransacoes1 = 1;
		char Transacao = 'S';
		double Total1 = 0;
		char SegundaVerificacao = 'S';
		String nome;
		Double CPF2;
		int talaoCheque = 0;
		int numTalao = 0;
		char PrimeiraConfirmacao = 'S';
		double Saldo2 = 0;
		int opcao;
		int operacao2 = 0;
		double Debito2 = 0;
		double Credito2 = 0;
		int operacoes2 = 0;
		int numConta2 = 0;
		int cpf;
		double numConta4 = 0;
		double CNPJ = 0;
		double emprestimo = 10000;
		double valorEmp4;
		double Saldo4 = 0;
		int operacao4 = 0;
		int opera;
		double Debito4;
		double Credito4;
		int operacoes4 = 0;
		double NumConta=0;
		double Debito=0,Credito=0, Saldo=0;
		double CPF=0;
		int metodo;
		char verificacao='S';
		int operacao;
		double valorLimite = 1000;
		int numeroOperacoes = 0;
		double valorOperacao;
		double valorCredito;
		
		
		
		System.out.println("\tBANCO DVLP\n");
		
		// TABELA COM DAS CONTAS
		while (SegundaVerificacao == 'S') {
			for (String conte : contas) {
				System.out.print((indice + 1) + " - ");
				System.out.println(conte);
				indice++;

			}
			indice = 0;

			// INFORME QUAL CONTA USAR

			do {
				do {
					System.out.println("\nEscreva um codigo para a utiliza��o da conta(1/2/3/4): ");
					conta = leia.nextInt();
				} while (conta > 5);
			} while (conta < 1);

			// INFORMA��ES BASICAS

			if (conta == 1) {
				do {
					System.out.println("Digite um n�mero para a conta: ");
					NumConta1 = leia.nextFloat();
				} while (NumConta1 < 1);
				do {

					System.out.println("Informe o dia de hoje: ");
					DataAniversario1 = leia.nextInt();
					if (DataAniversario1 >= 1 && DataAniversario1 < 31) {
						validacao = false;
					} else if (DataAniversario1 < 0 && DataAniversario1 > 31) {
						validacao = true;
					}

				} while (validacao == true);
				do {
					System.out.println("Informe seu CPF: ");
					CPF1 = leia.nextDouble();

				} while (CPF1 < 1000000000);
				System.out.printf("Seu Saldo � de %.2f reais", Saldo1);
				System.out.println("\n");

				do {

					while (NumTransacoes1 < 11) {
						System.out.println("\n\nCONTA POUPAN�A\n\n");
						do {
							System.out.println("\nDeseja fazer uma transa��o ?");
							Transacao = leia.next().toUpperCase().charAt(0);
							if (Transacao != 'S' && Transacao != 'N') {
								PrinmeiraVerificacao = 'S';
							} else {
								PrinmeiraVerificacao = 'N';
							}
						} while (PrinmeiraVerificacao == 'S');

						if (Transacao == 'S') {

							System.out.println("N�mero de Transa��es " + NumTransacoes1++);
							System.out.println("\nM�todos ");
							System.out.println("1- Cr�dito \n2- D�bito");
							System.out.println("Sr(a) gostaria de fazer uma transa��o com m�todo 1 ou 2 ?");
							metodo1 = leia.nextInt();

							if (metodo1 == 1) {
								if (DataAniversario1 == 11) {
									do {
										System.out.println("\nDigite o valor a Creditar: ");
										Credito1 = leia.nextDouble();
										if (Credito1 > 0) {
											Credito1 = (Credito1 + ((Credito1 * 0.5) / 100));
											Total1 = Total1 + Credito1;
											System.out.printf("Seu Saldo Atual � de: %.2f reias", Total1);
										}
									} while (Credito1 <= 0);
								} else {
									do {
										System.out.println("\nDigite o valor a Creditar: ");
										Credito1 = leia.nextDouble();
										if (Credito1 > 0) {
											Saldo1 = (Credito1 + Saldo1);
											Total1 = Total1 + Credito1;
											System.out.printf("Seu Saldo Atual � de: %.2f reais", Total1);
										}
									} while (Credito1 <= 0);
								}

							} else if (metodo1 == 2) {
								do {
									if (Total1 > 0) {
										do {
											System.out.println("\nDigite o valor a Retirar: ");
											Debito1 = leia.nextDouble();
											if (Debito1 > Total1) {
												System.out.println(
														"N�o � possivel retirar um valor maior que o guardado");
												SegundaVerificacao = 'S';

											}

											else if (Total1 > Debito1) {
												if (Debito1 > 0) {
													Total1 = Total1 - Debito1;
													System.out.println("Seu saldo �: " + Total1 + " reais");
												}
												SegundaVerificacao = 'N';
												PrinmeiraVerificacao = 'N';

											}
										} while (SegundaVerificacao == 'S');
									} else if (Total1 == 0) {

										System.out.printf("Seu saldo � de %.2f reais, impossivel retirada de valor",
												Saldo1);
										System.out.println("\nGostaria de adicionar um valor(S/N): ");
										adicionar = leia.next().toUpperCase().charAt(0);
										PrinmeiraVerificacao = 'N';
										if (adicionar == 'S') {

											if (DataAniversario1 == 11) {
												System.out.println("Digite o valor a Creditar: ");
												Credito1 = leia.nextDouble();
												if (Credito1 > 0) {
													Credito1 = (Credito1 + ((Credito1 * 0.5) / 100));
													Total1 = Total1 + Credito1;
													System.out.printf("Seu Saldo Atual � de: %.2f reias", Total1);
												}
											} else if (DataAniversario1 != 11) {
												System.out.println("Digite o valor a Creditar: ");
												Credito1 = leia.nextDouble();
												if (Credito1 > 0) {
													Total1 = (Credito1 + Total1);
													System.out.printf("Seu Saldo Atual � de: %.2f reais", Total1);
												}

											}

											PrinmeiraVerificacao = 'S';

										}
									}

								} while (PrinmeiraVerificacao == 'S');

								Total1 = Saldo1 + Total1;
							}

						} else if (Transacao == 'N') {

							System.out.println("Deseja voltar as op��es de contas ?");
							SegundaVerificacao = leia.next().toUpperCase().charAt(0);
							break;

						}

					}

				} while (Transacao == 'S');

			}

			// CONTA CORRENTE
			if (conta == 2) {
				System.out.print("Insira n�mero da conta: ");
				numConta2 = leia.nextInt();
				System.out.print("Insira seu nome: ");
				nome = leia.next();
				do {
					System.out.println("Informe seu CPF: ");
					CPF2 = leia.nextDouble();

				} while (CPF2 < 1000000000);

				System.out.println("Ol� " + nome + " voc� entrou em sua conta corrente!!");
				System.out.println("Voc� disp�e de " + talaoCheque + " tal�es de cheque");
				System.out.println("Seu saldo: " + Saldo2);
				System.out.println("Voc� deseja tal�es de cheque? ");
				PrimeiraConfirmacao = leia.next().toUpperCase().charAt(0);
				if (PrimeiraConfirmacao == 'S') {
					System.out.println("Quantos voc� deseja (1-10)?");
					numTalao = leia.nextInt();
					talaoCheque = talaoCheque + numTalao;
					System.out.println("Voc� dip�e de " + talaoCheque + "tal�es de cheque");
					operacoes2++;
					System.out.println((operacoes2) + "� Opera��o em '1' - Cr�dito / '2' - D�bito");
					operacao2 = leia.nextInt();
					if (operacao2 == 1) {
						System.out.println("Digite o valor da opera��o: ");
						Credito2 = leia.nextDouble();
						Saldo2 = Saldo2 + Credito2;
						System.out.println("Voc� tem " + Saldo2 + "R$ de saldo.");
					} else if (PrimeiraConfirmacao == 2) {
						System.out.println("Digite o valor da opera��o: ");
						Debito2 = leia.nextDouble();
						if (Debito2 > Saldo2) {
							System.out.println("Voc� n�o tem saldo para esta opera��o de d�bito.");
						} else {
							Saldo2 = Saldo2 - Debito2;
							System.out.println("Voc� tem " + Saldo2 + "R$ de saldo.");
						}
					}
				} else if (PrimeiraConfirmacao == 'N') {
					System.out.println("\nEncerrada a sess�o");
				}
			}
			//for(x=0;x<4;x++){
			//System.out.println((x+1)+" - "+contas[x]);
		
			System.out.println("\nEscreva um codigo para a utiliza��o da conta(1/2/3/4): ");
			conta=leia.nextInt();
			
			if(conta ==3)
			{
				System.out.println("Digite seu nome: ");
				nome = leia.next();
				System.out.println("Digite sua conta: ");
				NumConta = leia.nextDouble();
				System.out.println("Digite seu CPF: ");
				CPF = leia.nextDouble();
				System.out.println("Ol� "+nome+" voc� entrou em sua conta comercial. ");
				System.out.println("Voc� disp�e de: " + valorLimite + "R$");
				
				while(numeroOperacoes <= 10)
				{
					System.out.println((numeroOperacoes + 1)+ "� OPERA��O - Deseja realizar qual movimenta��o 1-D�bito ou 2-Cr�dito");
					operacao = leia.nextInt();
					
					while(operacao > 2 || operacao <=0 )
					{
						System.out.println("Opera��o inv�lida, digite novamente 1-D�bito ou 2- Cr�dito: ");
						operacao = leia.nextInt();
					}
					
					
					if(operacao ==1)
					{
						System.out.println("Digite o valor de retirada: ");
						valorOperacao = leia.nextDouble();
						valorLimite = valorLimite - valorOperacao;
						
						if(valorLimite>0)
						{
						System.out.println("Voc� tem disponivel: " + valorLimite + "R$");
						}
						else
					{
						System.out.println("Voc� n�o possui esse limite dispon�vel!");
					}
						
					}
					if(operacao ==2)
					{
						System.out.println("Digite o valor que deseja creditar em sua conta: ");
						valorCredito = leia.nextDouble();
						valorLimite = valorLimite + valorCredito;
						System.out.println("Voc� tem disponivel: " + valorLimite + "R$");
					}
				
					numeroOperacoes++;
					
				}
			
			}
			//- DEBITO E CREDITO POR DIA
			//- SE SALDO MENOR QUE ZERO PARA O MOVIMENTO SOLICITAR USAR DO LIMITE E MOSTRA QUANTO SOBROU DO LIMITE
	


	if(conta==4)

	{ // CONTA EMPRESARIAL
		System.out.println("Digite seu nome completo: ");
		nome = leia.next();
		System.out.println("Digite sua conta: ");
		numConta4 = leia.nextInt();
		System.out.println("Digite seu CNPJ: ");
		CNPJ = leia.nextDouble();
		System.out.println("Ol� " + nome + " voc� entrou em sua conta empresarial. ");
		System.out.println("Dispoibilizamos � voc� um empr�stimo empresarial com o limite de: 10.000 reais ");
		System.out.println("Voc� deseja fazer um empr�stimo? 'S'-Sim / 'N'-N�o");
		SegundaVerificacao = leia.next().toUpperCase().charAt(0);
		if (SegundaVerificacao == 'S') {
			System.out.println("Deseja fazer um empr�stimo de quanto R$?");
			valorEmp4 = leia.nextDouble();
			emprestimo = emprestimo - valorEmp4;
			Saldo4 = valorEmp4;
			System.out.println("Devido ao emprestimo feito voc� tem disponibilizado " + Saldo4
					+ "R$ de saldo para as opera��es do dia.");
		} else if (SegundaVerificacao == 'N') {
			while (operacoes4 < 4 || Saldo4 > 0) {
				System.out.println((operacoes4 + 1) + "� Opera��o em '1' - D�bito // '2' - Cr�dito?");
				opera = leia.nextInt();
				if (opera == 1) {
					System.out.println("Digite o valor da opera�ao: ");
					Debito4 = leia.nextDouble();
					if (Debito4 > Saldo4) {
						System.out.println("Voc� n�o tem saldo para esta opera��o de d�bito.");
					} else {
						Saldo4 = Saldo4 - Debito4;
						System.out.println("Voc� tem " + Saldo4 + "R$ de saldo.");
					}
				} else if (opera == 2) {
					System.out.println("Digite o valor que deseja creditar em sua conta: ");
					Credito4 = leia.nextDouble();
					Saldo4 = Saldo4 + Credito4;
					System.out.println("Voc� tem " + Saldo4 + "R$ de saldo.");
				}
				operacoes4++;
			}
		}
	

}if(SegundaVerificacao=='S')

	{
		PrinmeiraVerificacao = 'S';
	}else if(SegundaVerificacao=='N')
	{
		SegundaVerificacao = 'N';
		System.out.println("\nEncerrada a sess�o");

	}

}
	}
}

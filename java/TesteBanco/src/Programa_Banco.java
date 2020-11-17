import java.util.Scanner;

public class Programa_Banco {
	public static void main(String[] args) {

		String contas[] = { "Conta Poupança", "Conta Corrente", "Conta Especial", "Conta Empresarial" };
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
					System.out.println("\nEscreva um codigo para a utilização da conta(1/2/3/4): ");
					conta = leia.nextInt();
				} while (conta > 5);
			} while (conta < 1);

			// INFORMAÇÕES BASICAS

			if (conta == 1) {
				do {
					System.out.println("Digite um número para a conta: ");
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
				System.out.printf("Seu Saldo é de %.2f reais", Saldo1);
				System.out.println("\n");

				do {

					while (NumTransacoes1 < 11) {
						System.out.println("\n\nCONTA POUPANÇA\n\n");
						do {
							System.out.println("\nDeseja fazer uma transação ?");
							Transacao = leia.next().toUpperCase().charAt(0);
							if (Transacao != 'S' && Transacao != 'N') {
								PrinmeiraVerificacao = 'S';
							} else {
								PrinmeiraVerificacao = 'N';
							}
						} while (PrinmeiraVerificacao == 'S');

						if (Transacao == 'S') {

							System.out.println("Número de Transações " + NumTransacoes1++);
							System.out.println("\nMétodos ");
							System.out.println("1- Crédito \n2- Débito");
							System.out.println("Sr(a) gostaria de fazer uma transação com método 1 ou 2 ?");
							metodo1 = leia.nextInt();

							if (metodo1 == 1) {
								if (DataAniversario1 == 11) {
									do {
										System.out.println("\nDigite o valor a Creditar: ");
										Credito1 = leia.nextDouble();
										if (Credito1 > 0) {
											Credito1 = (Credito1 + ((Credito1 * 0.5) / 100));
											Total1 = Total1 + Credito1;
											System.out.printf("Seu Saldo Atual é de: %.2f reias", Total1);
										}
									} while (Credito1 <= 0);
								} else {
									do {
										System.out.println("\nDigite o valor a Creditar: ");
										Credito1 = leia.nextDouble();
										if (Credito1 > 0) {
											Saldo1 = (Credito1 + Saldo1);
											Total1 = Total1 + Credito1;
											System.out.printf("Seu Saldo Atual é de: %.2f reais", Total1);
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
														"Não é possivel retirar um valor maior que o guardado");
												SegundaVerificacao = 'S';

											}

											else if (Total1 > Debito1) {
												if (Debito1 > 0) {
													Total1 = Total1 - Debito1;
													System.out.println("Seu saldo é: " + Total1 + " reais");
												}
												SegundaVerificacao = 'N';
												PrinmeiraVerificacao = 'N';

											}
										} while (SegundaVerificacao == 'S');
									} else if (Total1 == 0) {

										System.out.printf("Seu saldo é de %.2f reais, impossivel retirada de valor",
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
													System.out.printf("Seu Saldo Atual é de: %.2f reias", Total1);
												}
											} else if (DataAniversario1 != 11) {
												System.out.println("Digite o valor a Creditar: ");
												Credito1 = leia.nextDouble();
												if (Credito1 > 0) {
													Total1 = (Credito1 + Total1);
													System.out.printf("Seu Saldo Atual é de: %.2f reais", Total1);
												}

											}

											PrinmeiraVerificacao = 'S';

										}
									}

								} while (PrinmeiraVerificacao == 'S');

								Total1 = Saldo1 + Total1;
							}

						} else if (Transacao == 'N') {

							System.out.println("Deseja voltar as opções de contas ?");
							SegundaVerificacao = leia.next().toUpperCase().charAt(0);
							break;

						}

					}

				} while (Transacao == 'S');

			}

			// CONTA CORRENTE
			if (conta == 2) {
				System.out.print("Insira número da conta: ");
				numConta2 = leia.nextInt();
				System.out.print("Insira seu nome: ");
				nome = leia.next();
				do {
					System.out.println("Informe seu CPF: ");
					CPF2 = leia.nextDouble();

				} while (CPF2 < 1000000000);

				System.out.println("Olá " + nome + " você entrou em sua conta corrente!!");
				System.out.println("Você dispõe de " + talaoCheque + " talões de cheque");
				System.out.println("Seu saldo: " + Saldo2);
				System.out.println("Você deseja talões de cheque? ");
				PrimeiraConfirmacao = leia.next().toUpperCase().charAt(0);
				if (PrimeiraConfirmacao == 'S') {
					System.out.println("Quantos você deseja (1-10)?");
					numTalao = leia.nextInt();
					talaoCheque = talaoCheque + numTalao;
					System.out.println("Você dipõe de " + talaoCheque + "talões de cheque");
					operacoes2++;
					System.out.println((operacoes2) + "ª Operação em '1' - Crédito / '2' - Débito");
					operacao2 = leia.nextInt();
					if (operacao2 == 1) {
						System.out.println("Digite o valor da operação: ");
						Credito2 = leia.nextDouble();
						Saldo2 = Saldo2 + Credito2;
						System.out.println("Você tem " + Saldo2 + "R$ de saldo.");
					} else if (PrimeiraConfirmacao == 2) {
						System.out.println("Digite o valor da operação: ");
						Debito2 = leia.nextDouble();
						if (Debito2 > Saldo2) {
							System.out.println("Você não tem saldo para esta operação de débito.");
						} else {
							Saldo2 = Saldo2 - Debito2;
							System.out.println("Você tem " + Saldo2 + "R$ de saldo.");
						}
					}
				} else if (PrimeiraConfirmacao == 'N') {
					System.out.println("\nEncerrada a sessão");
				}
			}
			//for(x=0;x<4;x++){
			//System.out.println((x+1)+" - "+contas[x]);
		
			System.out.println("\nEscreva um codigo para a utilização da conta(1/2/3/4): ");
			conta=leia.nextInt();
			
			if(conta ==3)
			{
				System.out.println("Digite seu nome: ");
				nome = leia.next();
				System.out.println("Digite sua conta: ");
				NumConta = leia.nextDouble();
				System.out.println("Digite seu CPF: ");
				CPF = leia.nextDouble();
				System.out.println("Olá "+nome+" você entrou em sua conta comercial. ");
				System.out.println("Você dispõe de: " + valorLimite + "R$");
				
				while(numeroOperacoes <= 10)
				{
					System.out.println((numeroOperacoes + 1)+ "ª OPERAÇÃO - Deseja realizar qual movimentação 1-Débito ou 2-Crédito");
					operacao = leia.nextInt();
					
					while(operacao > 2 || operacao <=0 )
					{
						System.out.println("Operação inválida, digite novamente 1-Débito ou 2- Crédito: ");
						operacao = leia.nextInt();
					}
					
					
					if(operacao ==1)
					{
						System.out.println("Digite o valor de retirada: ");
						valorOperacao = leia.nextDouble();
						valorLimite = valorLimite - valorOperacao;
						
						if(valorLimite>0)
						{
						System.out.println("Você tem disponivel: " + valorLimite + "R$");
						}
						else
					{
						System.out.println("Você não possui esse limite disponível!");
					}
						
					}
					if(operacao ==2)
					{
						System.out.println("Digite o valor que deseja creditar em sua conta: ");
						valorCredito = leia.nextDouble();
						valorLimite = valorLimite + valorCredito;
						System.out.println("Você tem disponivel: " + valorLimite + "R$");
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
		System.out.println("Olá " + nome + " você entrou em sua conta empresarial. ");
		System.out.println("Dispoibilizamos à você um empréstimo empresarial com o limite de: 10.000 reais ");
		System.out.println("Você deseja fazer um empréstimo? 'S'-Sim / 'N'-Não");
		SegundaVerificacao = leia.next().toUpperCase().charAt(0);
		if (SegundaVerificacao == 'S') {
			System.out.println("Deseja fazer um empréstimo de quanto R$?");
			valorEmp4 = leia.nextDouble();
			emprestimo = emprestimo - valorEmp4;
			Saldo4 = valorEmp4;
			System.out.println("Devido ao emprestimo feito você tem disponibilizado " + Saldo4
					+ "R$ de saldo para as operações do dia.");
		} else if (SegundaVerificacao == 'N') {
			while (operacoes4 < 4 || Saldo4 > 0) {
				System.out.println((operacoes4 + 1) + "ª Operação em '1' - Débito // '2' - Crédito?");
				opera = leia.nextInt();
				if (opera == 1) {
					System.out.println("Digite o valor da operaçao: ");
					Debito4 = leia.nextDouble();
					if (Debito4 > Saldo4) {
						System.out.println("Você não tem saldo para esta operação de débito.");
					} else {
						Saldo4 = Saldo4 - Debito4;
						System.out.println("Você tem " + Saldo4 + "R$ de saldo.");
					}
				} else if (opera == 2) {
					System.out.println("Digite o valor que deseja creditar em sua conta: ");
					Credito4 = leia.nextDouble();
					Saldo4 = Saldo4 + Credito4;
					System.out.println("Você tem " + Saldo4 + "R$ de saldo.");
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
		System.out.println("\nEncerrada a sessão");

	}

}
	}
}

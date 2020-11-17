import java.util.Scanner;

public class Teste1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String contas[] = { "Conta Poupança", "Conta Corrente", "Conta Especial", "Conta Empresarial" };

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
												System.out.println("Não é possivel retirar um valor maior que o guardado");
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

		}
		if (SegundaVerificacao == 'S') {
			PrinmeiraVerificacao = 'S';
		} else if (SegundaVerificacao == 'N') {
			SegundaVerificacao = 'N';
			System.out.println("\nEncerrada a sessão");

		}

	}
}

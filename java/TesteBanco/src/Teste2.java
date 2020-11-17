import java.util.Scanner;

public class Teste2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String contas[] = { "Conta Poupança", "Conta Corrente", "Conta Especial", "Conta Empresarial" };
		int conta = 0;
		Double CPF2;
		int talaoCheque = 0;
		int numTalao = 0;
		int indice = 0;
		String nome;
		char PrimeiraConfirmacao = 'S';
		double Saldo2 = 0;
		int opcao;
		int operacao2 = 0;
		double Debito2 = 0;
		double Credito2 = 0;
		int operacoes2 = 0;
		int x = 0;
		int numConta2 = 0;

		System.out.println("\tBANCO DVLP\n");

		for (String conte : contas) {
			System.out.print((indice + 1) + " - ");
			System.out.println(conte);
			indice++;
		}
		indice = 0;

		do {
			do {
				System.out.println("\nEscreva um codigo para a utilização da conta(1/2/3/4): ");
				conta = leia.nextInt();
			} while (conta > 5);
		} while (conta < 1);

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
	}
}
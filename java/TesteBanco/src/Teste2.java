import java.util.Scanner;

public class Teste2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String contas[] = { "Conta Poupan�a", "Conta Corrente", "Conta Especial", "Conta Empresarial" };
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
				System.out.println("\nEscreva um codigo para a utiliza��o da conta(1/2/3/4): ");
				conta = leia.nextInt();
			} while (conta > 5);
		} while (conta < 1);

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
	}
}
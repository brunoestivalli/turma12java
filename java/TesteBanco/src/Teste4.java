import java.util.Scanner;

public class Teste4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String contas[] = { "Conta Poupan�a", "Conta Corrente", "Conta Especial", "Conta Empresarial" };
		int conta = 0;
		int cpf;
		double numConta4 = 0;
		double CNPJ = 0;
		int indice = 0;
		String nome;
		double emprestimo = 10000;
		char SegundaVerificacao = 'S';
		double valorEmp4;
		double Saldo4 = 0;
		int opcao;
		int operacao4 = 0;
		int opera;
		double Debito4;
		double Credito4;
		int operacoes4 = 0;

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


		if (conta == 4) { // CONTA EMPRESARIAL
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
		}

	}
}

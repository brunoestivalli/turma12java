package Entidades;

public class ContaPoupanca extends Contas{
	private int aniversarioConta;
	public ContaPoupanca(String cpf, int numero, int aniversarioConta) {
		super(cpf, numero);
		this.aniversarioConta = aniversarioConta;
	}

	
	
}

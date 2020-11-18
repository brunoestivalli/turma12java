package Classes;

public class ContaPoupanca extends Conta{
	private int DataAniversario;

	public ContaPoupanca(int numero, int dataAniversario) {
		super(numero);
		DataAniversario = dataAniversario;
	}

	public ContaPoupanca(int numero, String cpf_cnpj, int dataAniversario) {
		super(numero, cpf_cnpj);
		DataAniversario = dataAniversario;
	}

	public int getDataAniversario() {
		return DataAniversario;
	}

	public void setDataAniversario(int dataAniversario) {
		DataAniversario = dataAniversario;
	}
	
	
	
	
}

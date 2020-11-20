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
	
	
	
		public void  correcao(int data) {
			double novosaldo=0.0;
			novosaldo=(super.getSaldo()*0.005);
			if(super.getSaldo()>0 && data== this.DataAniversario) {
				
				super.creditar(novosaldo);
				
			}
			
		}
	
	
	
	
}

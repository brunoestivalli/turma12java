package Classes;

public class ContaEspecial extends ContaCorrente{
	
	private double limite;
	
	public ContaEspecial(int numero,String cpf_cnpj) {
		super(numero, cpf_cnpj);
		this.limite=limite;
		}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void usarLimite(double valor) {
		if(super.getSaldo()<=0 && this.limite<=valor) {
			
			this.limite -= valor;
			super.creditar(valor);
			
		}
		
	}
	
	 

}

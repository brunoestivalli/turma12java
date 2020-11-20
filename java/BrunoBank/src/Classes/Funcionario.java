package Classes;

public class Funcionario {
	private String cod;
	protected double horas;
	protected double valorhora;
	
	public Funcionario(){
		
	}
	
	public Funcionario(String cod, double horas, double valorhora) {
		super();
		this.cod = cod;
		this.horas = horas;
		this.valorhora = valorhora;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public double getValorhora() {
		return valorhora;
	}

	public void setValorhora(double valorhora) {
		this.valorhora = valorhora;
	}
	
	public double pagamentoSalario() {
		return this.horas*this.valorhora;
	}
	
}

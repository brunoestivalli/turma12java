package Classes;

public class Terceiro extends Funcionario {
	private double adicional;

	public Terceiro(String cod, double horas, double valorhora, double adicional) {
		super(cod, horas, valorhora);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public double pagamentoSalario(){
		return(this.valorhora*this.horas)+adicional;
	}
}

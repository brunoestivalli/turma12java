package Entidades;

public class Contas {
	private String cpf;
	private double saldo;
	private int numero;
	
	//construtor
	
	public Contas(String cpf, int numero) {
		this.cpf=cpf;
		this.numero=numero;
		
	}
	//get set 

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public void debite(double valorDebito) {
		this.saldo=this.saldo-valorDebito;
	}
	public void credite(double valorCredito) {
		this.saldo=this.saldo+valorCredito;
	}
	
	
	
	
	
	
}

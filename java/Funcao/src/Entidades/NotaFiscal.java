package Entidades;

public class NotaFiscal {
	
	public String data;
	public String numeroNotaFiscal;
	public double imposto;
	
	
	public NotaFiscal(String data, String numeroNotaFiscal, double imposto) {
		
		this.data = data;
		this.numeroNotaFiscal = numeroNotaFiscal;
		this.imposto = imposto;
		
	}
	public NotaFiscal(String data, String numeroNotaFiscal) {
		
		this.data = data;
		this.numeroNotaFiscal = numeroNotaFiscal;
		
	}
	
	
}

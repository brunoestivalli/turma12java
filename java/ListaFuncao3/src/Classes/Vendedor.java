/*
 *  Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor tem como atributos da classe Pessoa e 
 *  também os atributos próprios como valorVendas (correspondente ao valor monetário dos artigos vendidos) e o 
 *  atributo comissao (porcentagem do valorVendas que será adicionado ao vencimento base do Vendedor).
 */


package Classes;

public class Vendedor extends Pessoa{
	private double valorVendas;
	private double comissao;
	public Vendedor(String nome, String endereco, String telefone, double valorVendas, double comissao) {
		super(nome, endereco, telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
}

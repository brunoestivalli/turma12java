/*
 * Implemente a classe Administrador como subclasse da classe pessoa. Um determinado administrador tem como atributos da 
 * classe Pessoa e tamb�m os atributos pr�prios como ajudaDeCusto (ajudas referentes a viagens, estadias).

 */


package Classes;

public class Administrador extends Pessoa{
	private Double ajudaDeCusto;

	public Administrador(String nome, String endereco, String telefone, Double ajudaDeCusto) {
		super(nome, endereco, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public Double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(Double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	

}

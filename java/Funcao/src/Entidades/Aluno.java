package Entidades;

public class Aluno {
	
	//ATRIBUTOS
	
	private int matricula;
	private String nome;
	private int anoNascimento;
	private char genero; 
	private boolean ativo;
	
	//CONSTRUTORES
	
	public Aluno(){
		
	}

	public Aluno(int matricula, String nome) {
		
		this.matricula = matricula;
		this.nome = nome;
		
	}


	
	


	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}


	public  String obterGenero() {
		String tipoGenero="";
		if (this.genero=='M') { 
			tipoGenero="Aluno";
		}else if(this.genero=='F') {
			tipoGenero="Aluna";
		}else if(this.genero=='O'){
			tipoGenero="Alune";
		}
		return tipoGenero;
		
	}
	public int idade() {
		
		return 2020-this.anoNascimento;
		
	}
	public int idade(int anoAtual) {
		
		return anoAtual-this.anoNascimento;
		
	}
	
	public void situacao() {
		this.ativo=true;
	}
	
	public void situacao(char status) {
		
		if(status=='A') {
			this.ativo=true;
		}else {
			this.ativo=false;
		}
	}
	

	

	
	
	
	
	

}

package Programas;

import Classes.Empregado;

public class TesteEmpregado {
	public static void main(String[] args) {
		Empregado empregado = new Empregado("Bruno","Av.Interlagos","5463-8294",1,1000,20);
		System.out.println("Nome empregado: "+empregado.getNome()+"\nEndere�o: "+empregado.getEndereco()+"\nTelefone: "+empregado.getTelefone()+"\nC�digo Setor: "+empregado.getCodigoSetor()+"\nSal�rio Base: "+empregado.getSalarioBase()+" reais \nImpostos em (%): "+empregado.getImposto()+" % \nSal�rio: "+empregado.calcularSalario()+" reais");;
	}

}

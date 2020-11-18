package Programas;

import Classes.Empregado;

public class TesteEmpregado {
	public static void main(String[] args) {
		Empregado empregado = new Empregado("Bruno","Av.Interlagos","5463-8294",1,1000,20);
		System.out.println("Nome empregado: "+empregado.getNome()+"\nEndereço: "+empregado.getEndereco()+"\nTelefone: "+empregado.getTelefone()+"\nCódigo Setor: "+empregado.getCodigoSetor()+"\nSalário Base: "+empregado.getSalarioBase()+" reais \nImpostos em (%): "+empregado.getImposto()+" % \nSalário: "+empregado.calcularSalario()+" reais");;
	}

}

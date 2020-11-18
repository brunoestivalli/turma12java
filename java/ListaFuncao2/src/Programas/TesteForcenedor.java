package Programas;

import Classes.Fornecedor;


public class TesteForcenedor {

	public static void main(String[] args) {
		
		Fornecedor fornecedor = new Fornecedor("Bruno","Av.Interlagos","5463-8294",1000,200);
		System.out.println("Nome: "+fornecedor.getNome()+"\nEndereço: "+fornecedor.getEndereco()+"\nTelefone: "+fornecedor.getTelefone()+"\nValor Crédito: "+fornecedor.getValorCredito()+" reais \nValor Divida: "+fornecedor.getValorDivida()+" reais"+"\nSaldo: "+fornecedor.obterSaldo()+" reais");
		
	}

}

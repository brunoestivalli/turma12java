package Aplicacao;

import Entidades.ContaPoupanca;
import Entidades.Contas;

public class TesteContas {

	public static void main(String[] args) {
		Contas conta1=new Contas("1111",1);
		ContaPoupanca contapop1= new ContaPoupanca("222",3,24);
	
		
		
		contapop1.credite(100);
		System.out.println(contapop1.getSaldo());
	
	}

}

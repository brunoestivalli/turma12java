programa{
	
	funcao inicio(){	
		real preco, Pordist, Porimpos, Total
		escreva("Digite o custo da fábrica: ")
		leia(preco)

		Pordist=preco*(28.0/100)
		Porimpos=preco*(45.0/100)
		Total=preco+Pordist+Porimpos
		escreva("O preço final a pagar é de: " +Total)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 266; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
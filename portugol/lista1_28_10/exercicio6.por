programa{
	inclua biblioteca Matematica --> mat
	
	funcao inicio(){
		real X1,Y1,X2,Y2,Total,d
		
		escreva("Digite ar coordenadas X1 do ponto P: ")
		leia(X1)
		escreva("Digite as coordenadas Y1 do ponto P: ")
		leia(Y1)
		escreva("Digite as coordenadas X2 do ponto P: ")
		leia(X2)
		escreva("Digite as coordenadas Y2 so ponto P: ")
		leia(Y2)

		d=mat.raiz((mat.potencia(X2-X1,2))+(mat.potencia(Y2-Y1,2)),2))
		escreva(d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 411; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
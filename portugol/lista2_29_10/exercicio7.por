programa
{
	
	funcao inicio()
	{
		real base,altura,area
		escreva("Escreva valores para a Base: ")
		leia(base)
		escreva("Escreva valores para Altura: ")
		leia(altura)

		se(base>0 e altura>0){
			area=(base*altura)/2
			escreva("A area do triângulo é de: "+area)
		}
		senao{
			escreva("Esse número não é valido")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 325; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
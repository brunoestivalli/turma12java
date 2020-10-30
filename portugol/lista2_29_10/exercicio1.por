programa
{
	
	funcao inicio()
	{
		real P, E, M, T
		escreva("Por favor, fale o peso(kg) dos tomates: ")
		leia(P)

		

		se(P>50){

			E=P-50.00
			M=E*4.00
			
			
			escreva("O excesso de peso é de: "+E+" quilos, a multa que João irá pagar será de: "+M+
			" reais")
			
		}
		senao{
			E=0
			M=0
			escreva("O excesso é de: "+E+" quilos, a multa que João irá pagar será de: "+M+ " 2reais")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 165; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
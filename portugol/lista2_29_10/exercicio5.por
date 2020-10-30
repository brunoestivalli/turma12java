programa
{
	
	funcao inicio()
	{
		real indP

		escreva("Indique o nivel de poluição: ")
		leia(indP)
		limpa()

		escreva("O índice de poluição é de: "+indP)

		se(indP >= 0.05 e indP<=0.25){
			escreva("\nNíveis aceitaveis de poluição") 
		}
		senao se(indP>=0.3 e indP<0.4){
			escreva("\nEmpresas do grupo 1 terão que parar de trabalhar")
		}
	
		senao se(indP>=0.4 e indP<0.5){
			escreva("\nTanto empresas do grupo 1 como as do 2 terão que parar")
		}
		senao se(indP>=0.5){
			escreva("\nAs empresas de todos os grupos terão que parar, excesso de polução")
			
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 111; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
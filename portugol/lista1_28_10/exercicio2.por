programa
{
	
	funcao inicio()
	{
		inteiro total
		inteiro anos
		inteiro meses
		inteiro dias

		escreva("Escreva quantos dias você tem em anos: ") 
		leia(dias)
		escreva("sua idades em dias é: \n ")
		
		anos=dias/365 
		meses=(dias % 365)/30
		dias=(dias%365)%30

		escreva("---------------------- \n")
		escreva(" anos: " +anos)
		escreva(" \n meses: " +meses)
		escreva("\n dias: " +dias)
		
		
	}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 259; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
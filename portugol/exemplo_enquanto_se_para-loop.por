programa
{
	
	funcao inicio()
	{
		//pedi ao usuario o tamanho da linha e imprimi na tela essa linha
		//variaveis
		inteiro tamanho
		inteiro dedoduro = 0
		//entrada
		escreva("digite o tamanho da linha entre 1 e 80:")
		leia(tamanho) //
		//processamento
		enquanto (tamanho < 0)
		{
			escreva("\nAMIGÃO, É SÓ PODE DE 1 ATÉ 80, DIGITE DE NOVO:")
			escreva("\ndigite o tamanho da linha entre 1 e 80:")
			leia(tamanho)
			dedoduro = dedoduro+1
			se (dedoduro == 3)
			{
				escreva("AMIGO, ASSIM NAO DAR, TCHAU!!")
				pare
			}
			
			//	
		}
		enquanto (tamanho > 80)
		{
			escreva("\nAMIGÃO, É SÓ ATE 80, DIGITE DE NOVO:")
			escreva("\ndigite o tamanho da linha entre 1 e 80:")
			leia(tamanho) //
		}
		
		para (inteiro x=1; x<=tamanho; x++)
		{
			escreva("═")
			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 216; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
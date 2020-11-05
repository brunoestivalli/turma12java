programa
{
	
	funcao inicio()
	{
		cadeia nome
		caracter sexo
		escreva("Digite o nome: ")
		leia(nome)

		escreva("\nDigite M para masculino, F para feminima ou O para outros: ")
		leia(sexo)

		se(sexo =='M'){
			escreva("\nPessoa do sexo masculino")
			
		}senao se (sexo =='F'){
			escreva("\nPessoa do sexo feminino")
		}senao{
			escreva("\nCada escolher o que quiser - Outros")
		}//sexo !='M'

		escreva("\nFim de programa")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 205; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
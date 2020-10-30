programa
{
	
	funcao inicio()
	{
		caracter sexo
		cadeia nomeUsuario
		inteiro anoNascimento, idadeUsuario
		const inteiro anoAtual=2020
		
		escreva("Olá, por favor, informe o seu nome: ")
		leia(nomeUsuario)	

		escreva("Escreva seu ano de anascimento: ")
		leia(anoNascimento)

		idadeUsuario= anoAtual-anoNascimento
		 
		 se(idadeUsuario <=18){
		 	escreva("Oi "+nomeUsuario,"você é menor de 18 anos e você tem "+idadeUsuario)
		 	
		 }
		 senao se(idadeUsuario==18){
		 	
		 	se(sexo=='M' ou sexo=="m"){
		 		
		 		escreva("\nOi, você tem 18 anos e é homem")
		 		
		 	}
		 	
		 }
		 senao{
		 
		 	escreva("\nOi, você é adulto, e sua idade é: "+idadeUsuario+"anos")
		 }
		 escreva("\nFim do programa")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 43; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
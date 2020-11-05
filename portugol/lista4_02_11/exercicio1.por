programa
{
	
	funcao inicio()
	{
		/*
		 *   Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e 
		 *   o escreva em seguida. Encontre após a maior pontuação e a apresente.
		 */


		 inteiro numero[5],x, y=0

		 para(x=0;x<5;x++){
		 	escreva("Entre com valores de pontuação: ")
		 	leia(numero[x])
		 }
		 para(x=0;x<5;x++){
		 	
		 	escreva("\nOs valores de pontuação são: ",numero[x])
		 	se(y<numero[x]){
		 		y=numero[x]
		 	}
		 	
		 }
		 escreva("\nO maior valor é de: ", y)
		
		 	
		 
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 341; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
		 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, 
		 * diagonal principal.
		 */
		 
		const inteiro linha=3
		const inteiro coluna=3
		inteiro quadrinhoDe8[linha][coluna]
		inteiro x= 0, y=0,somaDiagonal=0

		para(x=0;x<linha;x++){
			para(y=0; y<coluna;y++){
				quadrinhoDe8[x][y]=Util.sorteia(1,10)
				se(x==y){
				somaDiagonal=somaDiagonal+quadrinhoDe8[x][y]
				}
			}
		}
		para(x=0;x<linha;x++){
			para(y=0; y<coluna;y++){
				escreva(" ",quadrinhoDe8[x][y])
				
			}escreva("\n")
			
		}escreva("o resultado da diagonal principal é de: ",somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 405; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
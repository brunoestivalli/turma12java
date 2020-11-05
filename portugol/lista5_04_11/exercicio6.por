programa
{
	inclua biblioteca Util
	/*
	 * Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos. 
	 * Em seguida o programa deve fazer a multiplicação do vetor pelas colunas da matriz.
	 */
	funcao inicio(){
		const inteiro linha=3
		const inteiro coluna=3
		
		inteiro xuxu[3]
		inteiro z=0,x= 0, y=0
		
		inteiro N1[linha][coluna]
		
		escreva("Vetor de 3 valores\n\n")
		
		para(z=0;z<3;z++){
			xuxu[z]=Util.sorteia(1,9)
			escreva(" ",xuxu[z])
		}
		escreva("\n\n")
		escreva("Matriz N1 \n")
		para(x=0;x<linha;x++){
			escreva("\n")
			para(y=0; y<coluna;y++){
				
				N1[x][y]=Util.sorteia(1,9)
		
				escreva(" ", N1[x][y]"\n\n")
				
			}
		}
		escreva("\n\nVetor x Coluna")
		para(x=0;x<linha;x++){
			escreva("\n")
			para(y=0; y<coluna;y++){
				escreva(" ",xuxu[y]*N1[x][y])
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 824; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
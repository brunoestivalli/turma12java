programa
{
	/*
	 * 3-Escrever um programa que leia uma quantidade desconhecida de números e 
	 * conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. 
	 * A entrada de dados deve terminar quando for lido um número negativo.
	 */
	funcao inicio()
	{	
		inteiro numero=0,x1=0,x2=0,x3=0,x4=0
		logico confirmacao   = verdadeiro
		faca{
			escreva("\nDigite números: ")
			leia(numero)

			se(numero>0){
				confirmacao= verdadeiro
					
			}senao se(numero<0){
				confirmacao   = falso
			}
			se(numero>0 e numero<=25){
				x1=x1++
				
			}senao se(numero>=26 e numero<=50){
				x2=x2++
				
			}senao se(numero>=51 e numero<=75){
				x3=x3++
			}senao se(numero>=76 e numero<101){
				x4=x4++
			}

			escreva("\t\t\tEntre os numeros 0~25: ",x1,"\n")
			escreva("\t\t\tEntre os numeros 26~50: ",x2,"\n")
			escreva("\t\t\tEntre os numeros 51~75: ",x3,"\n")
			escreva("\t\t\tEntre os numeros 76~100: ",x4,"\n")
			
		}enquanto (confirmacao == verdadeiro)

		

		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 947; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
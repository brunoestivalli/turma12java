programa
{
	inclua biblioteca Util
	//biblioteca Util
	
	funcao inicio()
	{
		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
		 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize e 
		 * apresente também quantas foram as ocorrências da maior pontuação.
		 */
		const inteiro limite=10
		inteiro lancamento[limite]
		inteiro x=0,maiorValor=0
		real somalancamento=0.0
		inteiro contadorMaior=0
	
		para (x=0;x<limite;x++){
			lancamento[x]=Util.sorteia(1,6)
			escreva("\nvalor na posição: ",x+1," : ", lancamento[x])
			somalancamento=somalancamento+lancamento[x]

			se(lancamento[x]>=maiorValor){
				se(lancamento[x] != maiorValor){
					contadorMaior=1
				}
			}maiorValor=lancamento[x]
			contadorMaior++
			
		}
		escreva("\nTotal de valores somados: ", somalancamento)
		escreva("\nMedia aritmetica: ",(somalancamento/10))
		escreva("\nMaior valor: ",maiorValor)
		escreva("\nQuantas vezes aparece: ",contadorMaior)
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1015; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
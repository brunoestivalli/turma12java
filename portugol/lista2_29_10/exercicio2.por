programa
{
	
	funcao inicio()
	{
		real C, N, E, salT, salE
		escreva("Quantas horas esse Operario trabalhou: ")
		leia(N)

		se(N>50){
			C=50*10.00
			E=N-50
			salE=E*20
			salT=C+salE
			escreva("O salário excedente é de: "+salE+" reais e o salário total é de: "+salT+" reais")
			
		}
		senao se(N<50){
			C=N*10
			E=0
			salE=E*20
			salT=C
			escreva("O salário excedente é de: "+salE+" e o salário total é de: "+salT+" reais")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 149; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
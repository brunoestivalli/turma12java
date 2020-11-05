programa
{
	
	funcao inicio()
	{
		cadeia=nome
		caracter=sexo
		logico=ChefeFamilia
		real VH,VM
		escreva("Escreva seu nome: ")
		leia(nome)
		escreva("Digite M para masculino ou F para Feminino: ")
		leia(sexo)
		escreva("Você é chefe de Família Verdadeiro ou falso: ")
		leia(ChefeFamilia)

		VH=600.00
		VM=VH*2

		se(ChefeFamilia==verdadeiro){
			se(sexo == 'M' ou sexo =='m')
				escreva("Voçê é Homem e seu valor é de: "+VH+" reais")

			}
			senao se(sexo =='F' ou sexo =='f')
			{
			escreva("Você é mulher e seu valor é de: "+VM +" reais")
			}
		
			
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
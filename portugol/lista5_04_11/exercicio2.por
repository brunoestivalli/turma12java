programa
{
	inclua biblioteca Matematica --> mat
	/*
	 * O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação 
	 * sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo.
IMC em adultos Condição
Abaixo de 18,5 Abaixo do peso
Entre 18,5 e 25 Peso normal
Entre 25 e 30 Acima do peso
Acima de 30 obeso
	 */
	funcao inicio()
	{	real peso=0.0, altura=0.0, IMC=0.0
		escreva("Olá, escreva seu peso em KG: ")
		leia(peso)
		escreva("\n\nAgora sua altura em metros: ")
		leia(altura)

		IMC=peso/(altura*2)

		se(IMC<18.5){
			escreva("seu peso é de: ", mat.arredondar((IMC),2), " KG")
			
			escreva("\nAbaixo de 18.5, Abaixo do peso\n")
		}senao se(IMC>=18.5 e IMC<25){
			escreva("seu peso é de: ", mat.arredondar((IMC),2), " KG")
			escreva("\nEntre 18,5 e 25, Peso normal\n")
		}senao se(IMC>=25 e IMC<=30){
			escreva("seu peso é de: ", mat.arredondar((IMC),2), " KG")
			escreva("\nEntre 25 e 30, Acima do peso\n")
		}senao{
			escreva("seu peso é de: ", mat.arredondar((IMC),2), " KG")
			escreva("\nAcima de 30 obeso\n")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 646; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
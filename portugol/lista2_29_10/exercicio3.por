programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real num1, num2, num3, num4, Pn1, Pn2, Pn3, Pn4
		escreva("Olá, escreva o primeiro número: ")
		leia(num1)

		escreva("Olá, escreva o segundo número: ")
		leia(num2)

		escreva("Olá, escreva o terceiro número: ")
		leia(num3)

		escreva("Olá, escreva o quarto número: ")
		leia(num4)

		Pn1=mat.potencia(num1,2)

		Pn2=mat.potencia(num2,2)

		Pn3=mat.potencia(num3,2)

		Pn4=mat.potencia(num4,2)

		se(Pn3>=1000){
			escreva("O número é: "+num3+ " e o resultado dessa potenciação é: "+Pn3)
		}
		senao{
			escreva("os resultado do número 1 é: "+num1+" e o resultado da potencia é de: "+Pn1+"\n")
			escreva("os resultado do número 2 é: "+num2+" e o resultado da potencia é de: "+Pn2+"\n")
			escreva("os resultado do número 3 é: "+num3+" e o resultado da potencia é de: "+Pn3+"\n")
			escreva("os resultado do número 4 é: "+num4+" e o resultado da potencia é de: "+Pn4)	
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
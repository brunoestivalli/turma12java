programa
{
	
	funcao inicio()
	{
		inteiro idade
		escreva("Escreva a idade do Atleta: ")
		leia(idade)

		se(idade <5){
			escreva("Atleta não possui idade suficiente para ir nadar")
			
		}
		senao se(idade>=5 e idade<=7){
			escreva("Infantil A = 5 a 7")
		}senao se (idade>=8 e idade<=11){
			escreva("Infantil B = 8 a 11")
		}senao se (idade>=12 e idade<=13){
			escreva("Juvenil A = 12 a 13")
		}senao se (idade>=14 e idade<=17){
			escreva("Juvenil B = 14 a 17")
		}senao se (idade>18){
			escreva("Adulto > 18")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 378; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
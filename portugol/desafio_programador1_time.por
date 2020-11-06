programa
{
	
	funcao inicio()
	{
		inteiro pontosCor=0,pontosPal=0, pontosSan=0,pontosSpf=0,PontoF=0, rodada=0,c=0,p=0,sp=0,s=0
		cadeia cor,pal,san,spf,TF, Corinthins="C", Palmeiras="P", SPFC="SP", Santos="S"
		
		caracter parar
		parar = 'S'

		enquanto(parar != 'N'){
			
			rodada=rodada++
			escreva("\n RODADA ",rodada)
				
			escreva(" \nCORINTHIANS")
			escreva("\nGANHOU(3), PERDEU(0) OU EMPATOU(1): ")
			leia(pontosCor)
			c=pontosCor+c
			escreva(" \nPALMEIRAS")
			escreva("\nGANHOU(3), PERDEU(0) OU EMPATOU(1): ")
			leia(pontosPal)
			p=pontosPal+p
			escreva(" \nSANTOS")
			escreva("\nGANHOU(3), PERDEU(0) OU EMPATOU(1): ")
			leia(pontosSan)
			s=pontosSan+s
			escreva(" \nSPFC")
			escreva("\nGANHOU(3), PERDEU(0) OU EMPATOU(1): ")
			leia(pontosSpf)
			sp=pontosSpf+sp
	
			escreva("\ndeseja continuar S/N? ")
			leia(parar)

		}
		escreva("Os placar final é de: ")
		escreva("\nCORINTHIANS: ", pontosCor," Pontos")
		escreva("\nPALMEIRAS: ", pontosPal," Pontos")
		escreva("\nSANTOS: ", pontosSan," Pontos")
		escreva("\nSPFC: ", pontosSpf," Pontos")

		escreva("\nEscolha entre Corinthians com (C), Palmeiras com (P), Santos com (S), SPFC com(SP): ")
		leia(TF)
		
		se(TF== Corinthins){	
			escreva("Corinthians está com ",c, " pontos.")
				
		}senao se (TF==Palmeiras){
			
				
			escreva ("Palmeiras está com ",p, " pontos.")
			
				
		}senao se (TF==SPFC){
			
				
			escreva ("São Paulo está com ",sp, " pontos.")
				
		}senao se(TF==Santos){
			
				
			escreva ("Santos está com ",s, " pontos.")
				
		}senao{
			
		escreva ("Time inválido, escolha entre Corinthians, Palmeiras, Santos, SPFC")
	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 751; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
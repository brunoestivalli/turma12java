programa
{
	inclua biblioteca Matematica -->mat
	/*
	 * Elabore um programa que calcule o que deve ser pago por um produto, 
	 * considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
	 * Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e 
	 * efetuar o cálculo adequado.
Código Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 20% de desconto
2-À vista no cartão de crédito, recebe 15% de desconto
3-Em duas vezes, preço normal de etiqueta sem juros
4-Em três vezes, preço normal de etiqueta mais juros de 10%
	 */
	funcao inicio()
	{	real valor,valorDesconto,valorParcela,valorParJu
		inteiro x=0, Escolha=0
		
		escreva("Escreva o preço do produto: ")
		leia(valor)
		escreva("\n\n1-À vista em dinheiro ou cheque, recebe 20% de desconto",
		"\n2-À vista no cartão de crédito, recebe 15% de desconto",
		"\n3-Em duas vezes, preço normal de etiqueta sem juros ",
		"3\n4-Em três vezes, preço normal de etiqueta mais juros de 10%")
		escreva("\n\nEscolha a forma de pagamento(1/2/3/4):  ")
		leia(Escolha)
		
				se(Escolha==1){
					valorDesconto=valor-((valor*20)/100)
					mat.arredondar((valorDesconto),2)
					escreva("R$ ",valorDesconto)	
				}senao se(Escolha==2){
					valorDesconto=valor-((valor*15)/100)
					mat.arredondar((valorDesconto),2)
					escreva("R$ ",valorDesconto)	
				}senao se(Escolha==3){
					escreva("Duas parcela de: ") 
					valorParcela=valor/2
					mat.arredondar((valorParcela),2)
					escreva("R$ ",valorParcela)		
				}senao se(Escolha==4){
					escreva("Três parcela de: ") 
					valorParJu=(valor+(valor*10)/100)/3
					mat.arredondar((valorParJu),2)
					escreva("R$ ",valorParJu)		
				}
			
	}
}	
				
				
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1423; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
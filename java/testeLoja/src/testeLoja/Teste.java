package testeLoja;
import java.util.Scanner;
public class Teste {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		// Declara��o das v�riaveis
		String produtos[] = {"Arroz de 5Kg","Arroz de 1Kg","Feij�o de 1kg","Farofa de 500g","Nescau de 400g","Pe�a de picanha 1kg","Cartela com 12 Ovos",
				   			"Cartela com 24 Ovos", "Coca-Cola 2L", "Coca-Cola 600ml"};
		
		double precoProd[] = {30.00, 10.00, 12.00, 6.00, 7.00, 109.99, 12.99,20.99, 6.35, 4.00};
		
		int estoque[] = {10,10,10,10,10,10,10,10,10,10};
		int carrinho[] = new int[10];
		int carrinhoPreco[] = new int[10];
		int codProduto[] = new int[10];
		
		int qntProduto;
		int compraProduto=0;
		int contador = 0;
		int i = 0;
		int pagamento=0;
		int parcela = 0;
		double precoTotal = 0.0;
		double z=0.0;
		
		String c, m, r, l, k, j, t, w;
		char continua;
		boolean confirmacao = true;
		boolean validacao = true;
		
		//Mostrando todos os produtos e pedindo pro usu�rio qual que ele quer
		for ( i=0; i<10; i++){
			codProduto[i] = i;
		}
		for (i = 0; i < 10; i++)
		{
			System.out.println("_________________________________________________________\n" + codProduto[i] + " - " + produtos[i]+ "\t\t\tR$:" + precoProd[i]);
		}
		System.out.println("_________________________________________________________");
		
		System.out.println("\n\nDigite o c�digo do produto que deseja comprar: ");
			compraProduto = read.nextInt();
			
		if(compraProduto >= 0 && compraProduto <= 9)
		{
			carrinho[contador] = compraProduto;
			validacao = false;
		}
		else
		{
			System.out.println("Digite um c�digo v�lido");
			validacao = true;
		}
		
		System.out.println("Quantos produtos deseja comprar: ");
			qntProduto = read.nextInt();
		System.out.println("\n" + produtos[compraProduto]);
		
		// Verifica��o se tem produto dentro no estoque
		if(qntProduto < estoque[compraProduto])
		{
			estoque[compraProduto] = estoque[compraProduto] - qntProduto;
			System.out.println("O estoque � de: " + estoque[compraProduto] + " unidades");
		}
		else if(qntProduto > estoque[compraProduto])
		{
			System.out.println("Estoque insuficiente, temos apenas " + estoque[compraProduto] + " produtos");
		}
		
		// Se deseja fazer outra compra
		System.out.println("Desejar continuar comprando S/N: ");
			continua = read.next().toUpperCase().charAt(0);
		
		if(continua == 'S')
		{
			confirmacao = true;
		}
		else {
			confirmacao = false;
		}
			
			//carrinho de compras
			if(contador==0) {
				z=precoProd[compraProduto]*qntProduto;
				System.out.println("0 - "+produtos[carrinho[0]]+"\t\t"+precoProd[carrinho[0]]+"\t\t"+z);
				
			}else{
				for(i=0;i<contador;i++){
					z=precoProd[carrinho[i]]*carrinho[i];
					System.out.println(i+" - "+produtos[carrinho[i]]+"\t\t"+precoProd[carrinho[i]]+"\t\t"+z);
					
				}
			}
			
			System.out.printf("\n\n Total a pagar � de: %.2f Reais\n\n",z);
			//Formas de pagamento 
			
				if(pagamento>1 && pagamento<=3) {
					validacao=true;
				}else {
					validacao=false;
				}
				
				
				System.out.println(" _____________________________________________\n|             FORMAS DE PAGAMENTO             |\n|_____________________________________________|\n|1 - Pagamento � vista em dinheiro ou cheque. | \n|_____________________________________________|\n|2 - Pagamento � vista em cart�o de cr�dito.  | \n|_____________________________________________|\n|3 - Pagamento parcelado no Cart�o.           | \n|_____________________________________________|\n\n       Digite um n�mero de (1 a 3): " );
				pagamento=read.nextInt();
				
			System.out.println("---D'tudo um Pouco---\n\n\n");
			if (pagamento ==1) {
				z = (z+((z/100)*9));
				z=(z-(z/100)*20);
				System.out.printf("O pre�o do produto ser�:  R$ %.2f",z);
				System.out.println(" -- com acrescimo de 9% de imposto e desconto de 20% devido a forma de pagamento.");
				
			}else if(pagamento ==2) {
				z = (z+((z/100)*9));
				z=(z-(z/100)*20);
				System.out.printf("O pre�o do produto ser�:  R$ %.2f",z);
				System.out.println(" -- com acrescimo de 9% de imposto e desconto de 15% devido a forma de pagamento.");
				
			}else if (pagamento ==3) {
				z = (z+((z/100)*19));
				System.out.println("Parcelado em 2 ou 3 vezes ? ");
				parcela=read.nextInt();
				if(parcela==2) {
					z=(z+(z/100)*9);
					System.out.printf("O pre�o do produto ser� de: R$ %.2f",z);
					System.out.println(" -- com acrescimo de 9% de impostos e sem juros");
					System.out.println("O pre�o parcelado em 2 vezes ser� de:  R$: "+(z/2));
				}else {
					z=(z+(z/100)*19);
					System.out.printf("O pre�o do produto ser� de: R$ %.2f",z);
					System.out.println("-- com acrescimo de 9% de impostos e 10% de juros");
					System.out.println("O pre�o parcelado em 3 vezes ser� de:  R$: "+(z/3));
				}
			}
			
			
			System.out.println("Deseja continuar ? ");
			continua=read.next().toUpperCase().charAt(0);
			
			if(continua=='S') {
				confirmacao=true;
				z=0.0;
			}else {
				l="� vista, dinheiro ou em cheque";
				c="� vista, cart�o de credito";
				m="Parcelado em 2 vezes";
				r="Parcelado em 3 vezes";
				k="Impostos de 9% e desconto de 20%";
				j="Impostos de 9% e desconto de 15%";
				t="com acrescimo de 9% de impostos e sem juros";
				w="com acrescimo de 9% de impostos e juros de 10%";
						
						System.out.println("---D'tudo um Pouco---\n\n\n");
			}
			
			
			
			
			
	
	}
	
}

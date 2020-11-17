import java.util.Scanner;
public class Exercicio3ProdutosEletronicos {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		ProdutosEletronicos Produtos = new ProdutosEletronicos("PS5",4500.5, "Sony");
		
		System.out.print("Nome do Produto: ");
		System.out.println(Produtos.nomeProduto);
		System.out.print("Preço do Produto: ");
		System.out.println(Produtos.precoProduto);
		System.out.print("Marca do Produto: ");
		System.out.println(Produtos.MarcaProduto);
		
		
		
		
		
		
	}

}

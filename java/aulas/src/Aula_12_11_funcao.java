import java.util.Random;
public class Aula_12_11_funcao {
public static void main(String[] args) {
		
		Random numero = new Random(); //objeto de numero randomico
		
		//n1, n2, m1, m2 - LINHA 4 - COLUNA 6
		final int LINHA = 4; //CONST PORTUGOL É O FINAL EM JAVA
		final int COLUNA = 6;
		
		int N1[][] = new int[LINHA][COLUNA];
		int N2[][] = new int[LINHA][COLUNA];
		int M1[][] = new int[LINHA][COLUNA];
		int M2[][] = new int[LINHA][COLUNA];
		int novalinha=0, novacoluna=0;
		
		/*
		for (int xlinha=0; xlinha<LINHA; xlinha++)
		{
			 for (int ycoluna=0; ycoluna<COLUNA; ycoluna++)
			 {
				 N1[xlinha][ycoluna]=  (int) (Math.random() * 100); //isac //downcasting
				 N2[xlinha][ycoluna]=  numero.nextInt(100); //ed
				 M1[xlinha][ycoluna]= N1[xlinha][ycoluna] + N2[xlinha][ycoluna];
				 M2[xlinha][ycoluna]= N1[xlinha][ycoluna] - N2[xlinha][ycoluna];
			 }
		 }
		 */
		for (int geral[] : N1)  //linha
		{
			novacoluna=0; //gambiarra
			for (int valorteste : geral) //coluna
			{
				
				N1[novalinha][novacoluna]= (int) (Math.random() * 10);
				N2[novalinha][novacoluna]= (int) (Math.random() * 5);
				M1[novalinha][novacoluna]= N1[novalinha][novacoluna]+N2[novalinha][novacoluna];
				M2[novalinha][novacoluna]= N1[novalinha][novacoluna]-N2[novalinha][novacoluna];
				
				novacoluna++;
			}
			novalinha++;
		}
		
		
		
		//IMPRIMINDO OS VALORES DE N1
		System.out.println("IMPRIMINDO N1");
		for (int xlinha=0; xlinha<LINHA; xlinha++) // linha
		{
			 for (int ycoluna=0; ycoluna<COLUNA; ycoluna++) //coluna
			 {
				 System.out.print(N1[xlinha][ycoluna]+"\t"); //numero unico linha coluna
			 }
			 System.out.println();
		 }
		System.out.println("IMPRIMINDO N2");
		for (int xlinha=0; xlinha<LINHA; xlinha++) // linha
		{
			 for (int ycoluna=0; ycoluna<COLUNA; ycoluna++) //coluna
			 {
				 System.out.print(N2[xlinha][ycoluna]+"\t"); //numero unico linha coluna
			 }
			 System.out.println();
		 }
		System.out.println("IMPRIMINDO M1");
		for (int xlinha=0; xlinha<LINHA; xlinha++) // linha
		{
			 for (int ycoluna=0; ycoluna<COLUNA; ycoluna++) //coluna
			 {
				 System.out.print(M1[xlinha][ycoluna]+"\t"); //numero unico linha coluna
			 }
			 System.out.println();
		 }
		
		System.out.println("IMPRIMINDO M2");
		for (int xlinha=0; xlinha<LINHA; xlinha++) // linha
		{
			 for (int ycoluna=0; ycoluna<COLUNA; ycoluna++) //coluna
			 {
				 System.out.print(M2[xlinha][ycoluna]+"\t"); //numero unico linha coluna
			 }
			 System.out.println();
		 }
		
		System.out.println("IMPRIMINDO O M2 USANDO FOR EACH");
		
		for (int m2gambiarra[] : M2)
		{
			for (int valor : m2gambiarra)
			{
				System.out.print(valor+"\t");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}









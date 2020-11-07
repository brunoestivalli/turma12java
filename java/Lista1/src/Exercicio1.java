import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);
			int idade,meses,dias, Total;
			System.out.println("escreva sua idade, quantos meses e quantos dias você tem: ");
			idade=read.nextInt();
			meses=read.nextInt();
			dias=read.nextInt();
			
			idade=idade*365;
			meses=meses*30;
			Total=idade+meses+dias;
			
			System.out.println("sua idade é: " +Total+ " dias de vida");
			read.close();
			
	}
			

}

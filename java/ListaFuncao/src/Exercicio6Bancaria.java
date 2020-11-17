
public class Exercicio6Bancaria {

	public static void main(String[] args) {
		Bancaria bancaria= new Bancaria("Bruno",1,"50134565432");
		
		System.out.print("Nome do cliente: ");
		System.out.println(bancaria.nome);
		System.out.print("ID do cliente: ");
		System.out.println(bancaria.ID);
		System.out.print("CPF do cliente : ");
		System.out.println(bancaria.CPF);

	}

}

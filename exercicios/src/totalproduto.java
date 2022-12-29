import java.util.Locale;
import java.util.Scanner;

//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
//seguir, calcule e mostre o valor da conta a pagar.
public class totalproduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String exp;
		int codigo =  sc.nextInt();
		int quantidade = sc.nextInt();
	    exp = sc.next();
		double preco = sc.nextDouble();
		
		double valor;
		
		valor =  quantidade * preco;
		
		System.out.println("Código = " + codigo);
		System.out.println("Especificação " + exp);
		System.out.println("Preço " + valor);
		
				
		
		
		
		
		
		
sc.close();
	}

}

import java.util.Scanner;
import java.util.Locale;
//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

public class pecas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, cod2, num1, num2;
		double val1, val2, s1, s2, total;

		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		val1 = sc.nextDouble();
		
	    cod2 = sc.nextInt();
	    num2 = sc.nextInt();
	    val2 = sc.nextDouble();
	    
	    s1 = num1 * val1;
	    s2 = num2 * val2;
	    
	    total = s1 + s2;
	    
	    System.out.printf("Valor a pagar: %.2f%n", + total );

	    
	    sc.close();

	}

}

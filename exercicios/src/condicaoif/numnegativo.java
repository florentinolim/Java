package condicaoif;
//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
import java.util.Scanner;

public class numnegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		num =  sc.nextInt();
		
		if (num < 0 ) {
			System.out.println("Este numero é negativo " + num);
		}
		else {
			System.out.println(" Este numero não é negativo " + num);
		}
		
		sc.close();
	}
}

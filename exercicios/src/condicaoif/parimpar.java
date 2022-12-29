package condicaoif;
//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar//
import java.util.Scanner;

public class parimpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = 0;
		int res;

		x = sc.nextInt();

		res = (x % 2); // resto 0

		if (res == 0) {
			System.out.println("Numero par resto = "  + res);
		} else
			System.out.println("Numero impar resto = " + res);

		sc.close();

	}

}

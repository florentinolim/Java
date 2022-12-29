package condicaoif;
import java.util.Locale;
import java.util.Scanner;

//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

public class intervalos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();

		if (x < 0 || x > 100) {
			System.out.println("Fora do intervalo");

		} else if (x <= 25) {
			System.out.println("Numero no intervlo de: [0,25]");
		} else if (x > 25 && x <= 50) {
			System.out.println("Numero esta no intervalo de: [25,50]");

		} else if (x > 50 && x <= 75) {
			System.out.println("Numero esta no intervlo de: [50,75]");

		} else if (x > 75 && x <= 100) {
			System.out.println("Numero esta no intervalo de: [75,100]");

		}
		sc.close();

	}

}

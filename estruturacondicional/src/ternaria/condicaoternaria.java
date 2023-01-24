///Este esta usando o valor ternario

package ternaria;

import java.util.Locale;
import java.util.Scanner;

public class condicaoternaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05; //Aqui estamos usando a foma ternaria da condição
		System.out.println("Valor tenário = " + desconto);
		sc.close();
	}

}

//Este ainda não é a condição ternaria.

package ternaria;

import java.util.Locale;
import java.util.Scanner;

public class condifparaternaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double preco = 34.5;
		double desconto;
		
		if (preco< 20) {
			desconto =  preco * 0.1;
			
		}
		else {
			desconto = preco * 0.05;
						
		}
		System.out.println(desconto);
		
		sc.close();
		

	}

}

//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002
package repeticao;

import java.util.Scanner;

public class senha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 2002;
		x = sc.nextInt();

		while (x != 2002) {
			System.out.println("Senha invalida" + x);
			x = sc.nextInt();

		}
		System.out.println("Acesso permitido" + x);

		sc.close();

	}

}

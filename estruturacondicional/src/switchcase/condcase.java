package switchcase;

import java.util.Scanner;

public class condcase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "Domingo";
			break;

		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
		case 6:
			dia = "Sexta";
		case 7:
			dia = "Dia do senhor";
			break;
		default:
			dia = "Dia inexistente";
		}
		System.out.println("Dia da semana = \n" + dia);
		sc.close();
	}

}

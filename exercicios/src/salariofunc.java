//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais

import java.util.Locale;
import java.util.Scanner;


public class salariofunc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		double numhoras;
		double vhoras;
		double salario;
		
		num = sc.nextInt();
		numhoras = sc.nextDouble();
		vhoras = sc.nextDouble();
		
		salario = numhoras * vhoras;
		
		System.out.println("Numero do Funcionário: " + num);
		System.out.printf("Salario: %.2f%n", + salario);
		
		sc.close();
		
	}

}

package entradadedados;

import java.util.Scanner;

public class ScannerInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		x= sc.nextInt();
		System.out.println("Voce digitou: " + x);
		sc.close();

	}

}

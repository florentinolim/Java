package entradadedados;

import java.util.Scanner;

public class ScannerString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		sc.close();

	}

}

package repeticao;

import java.util.Scanner;

public class testemesaexec3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 100;
		int y = 100;
		x = sc.nextInt();
		while (x != y) {
			System.out.println("Olha");
			x = (int) Math.sqrt(y);
			sc.close();
		}

	}

}

package repeticao;

import java.util.Scanner;

public class testemesaexec1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 5;
		int y = 0;
		
		//x = sc.nextInt();
		while (x > 2) {
			System.out.println(x +  "-"  + y);
			y = y + x;
			x = x - 1;
		}
		sc.close();

	}

}

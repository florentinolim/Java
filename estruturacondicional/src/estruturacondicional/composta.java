package estruturacondicional;

import java.util.Scanner;

public class composta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hora ;
		
		hora = sc.nextInt();
		
		if(hora <12 ) {
			System.out.println("Bom dia");
		}
		else {
			System.out.println("Boa Tarde");
		}
	
		sc.close();

	}

}

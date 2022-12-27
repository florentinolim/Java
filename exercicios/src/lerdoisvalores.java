//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos
import java.util.Scanner;

public class lerdoisvalores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		int soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		soma = x + y;
		
	    System.out.println("A soma de: " + x + " + " + y + " = " + soma);
	    
		sc.close();
		

	}

}

package condicaoif;
import java.util.Locale;
import java.util.Scanner;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
public class horajogo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int hin = sc.nextInt();
		int hfim = sc.nextInt();

		int tempojogo;

		if (hin < hfim) {
			tempojogo = hfim - hin;
		} else {
			tempojogo = 24 - hin + hfim;
		}

		System.out.println("Duração do jogo = " + tempojogo + "Hora(s)");

		sc.close();
	}

}

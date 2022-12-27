import java.util.Locale;

public class exercicio01 {

	public static void main(String[] args) {
		String produto1 = "Computador";
		String produto2 = "Mesa de trabalho";

		int idade = 30;
		int codigo = 5290;
		char sexo = 'F';

		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;

		System.out.println("Produtos:");
		System.out.printf("%s, Com preço de $ %.2f%n", produto1, preco1);
		System.out.printf("%s, Com preço de $ %.2f%n", produto2, preco2);

		System.out.println();
		System.out.printf("Registo: %d anos de idade, Codígo %d e Sexo: %c%n", idade, codigo, sexo);
		System.out.println();

		System.out.printf("medidas com oito casas decimais: %.8f%n", medida);
		System.out.printf("Arrendondar para três casas decimais  %.3f%n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", medida);

	}

}

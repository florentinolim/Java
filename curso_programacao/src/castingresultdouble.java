
public class castingresultdouble {

	public static void main(String[] args) {
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		
		resultado = a /b;
		resultado = (double) a /b; // casting adicionando double para ter o resultado correto da divisão
		System.out.println(resultado);

	}

}

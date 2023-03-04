public class String3 {

	public static void main(String[] args) {

		String nome = "Gabriel Felipe Assuncao de Souza";

		String[] separado = nome.split(" ");

		for(int i = separado.length - 1; i >= 0; i--) {

			System.out.println(separado[i]);
		}

	}
}

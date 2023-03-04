import java.util.*;

class Teste {

	public static void main(String[] args) {

	System.out.println("\n\nStarting... \n");

	Collection<Integer> lista = new ArrayList<>();

	//long inicio = System.currentTimeMillis();

	int qtde = 300000;

	for(int i = 0; i <= qtde; i++) {

		lista.add(i);
	}

	long inicio = System.currentTimeMillis();

	for(int i = 0; i <= qtde; i++) {

		lista.contains(i);
	}

	long fim = System.currentTimeMillis();
	long tempo = fim - inicio;

	System.out.println("\nTempo de excecucao: " + tempo + " ms");

}
}

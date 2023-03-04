public class Classe implements Comparable<Classe> {


	private int numero;

	public Classe(int numero) {

		this.numero = numero;
	}

	public String toString() {

		return "Conta " + this.numero;
	}

	public int compareTo(Classe another) {

		if(this.numero < another.numero) return -1;
		if(this.numero > another.numero) return 1;

		return 0;

	}
}

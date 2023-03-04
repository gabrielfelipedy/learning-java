import java.util.*;

class Lists {

	public static void main(String[] args) {

		List<Classe> lista = new ArrayList<>();

		Classe c1= new Classe(6);
		Classe c2 = new Classe(3);
		Classe c3 = new Classe(8);

		lista.add(c1);
		lista.add(c2);
		lista.add(c3);

		System.out.println(lista + " tem " + lista.size() + " elementos");

		Collections.sort(lista);
		System.out.println(lista);
	}
}

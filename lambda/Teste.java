import java.util.*;

class Teste2 {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		lista.add("b..");
		lista.add("c.......");
		lista.add("a....");

		Collections.sort(lista);

		for(String x : lista) {
                        System.out.println(x);
                }

		lista.sort(s1, s2) -> Integer.compare(s1.length, s2.length););

		lista.forEach(x -> System.out.println(x););
	}
}

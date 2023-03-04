import java.util.*;

class Sets {

	public static void main(String[] args) {

		Set<String> conjunto = new HashSet<>();

		conjunto.add("c1");
		conjunto.add("c2");
		conjunto.add("c3");
		conjunto.add("c2");
		for(String x : conjunto) {
		System.out.println(x);
		}

		Iterator<String> i = conjunto.iterator();

		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}

public class String2 {

	public static void main(String[] args) {

		String palin = "Anotaram a data da maratona";

		for(int i = 0; i < palin.length(); i++) {

			System.out.print(palin.charAt(palin.length() - 1 - i));
		}
	}
}

class Ex04 {

	public static void main(String[] args) {

		for(int i = 1; i <=50; i++) {

			double fatorial = 1;
			int n = i;

		while (n > 1) {

			fatorial = fatorial * n;
			n -= 1;
		}

		System.out.println("O fatorial de " + i + " é " + fatorial);

		}
	}
}

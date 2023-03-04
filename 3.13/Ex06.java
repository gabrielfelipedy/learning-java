class Ex06 {
	public static void main(String[] args) {

		int n = 13;

		while (n > 1) {

			if (n % 2 != 0) {
				n = 3*n + 1;
			} else {
				n = n / 2;
			}

			System.out.print(n + " -> ");

		}

	}
}

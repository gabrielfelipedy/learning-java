class Ex05 {
	public static void main(String[] args) {

		int primeiro = 0;
		int segundo = 1;

		while (true) {

			System.out.print(primeiro + " -> ");

			if(segundo > 200) {
				break;
			}

			System.out.print(segundo + " -> ");

			primeiro += segundo;
			segundo += primeiro;
		}
	}
}

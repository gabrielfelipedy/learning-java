class Fibonacci {

	int calculaFibonacci(int elemento) {

		if(elemento == 0) {
			return 0;
		} else if (elemento == 1) {
			return 1;
		} else {

			return this.calculaFibonacci(elemento -1) + this.calculaFibonacci(elemento - 2);
		}
	}

}

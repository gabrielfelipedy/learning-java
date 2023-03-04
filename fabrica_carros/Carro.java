class Carro {

	String cor;
	String modelo;
	double vAtual;
	double vMaxima;
	Motor motor = new Motor();

	void liga() {

		System.out.println("ON");
	}

	void acelera(double valor) {

		this.vAtual += valor;
	}

	int getMarcha() {

		if(this.vAtual < 0) {

			return -1;

		} else if(this.vAtual < 40) {

			return 1;

		} else if(this.vAtual < 80) {

			return 2;
		}

		return 3;
	}
}

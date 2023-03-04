class TestCar {

	public static void main(String[] args) {

		Carro myCar = new Carro();
		myCar.cor = "Azul";
		myCar.modelo = "BMW";

		myCar.vAtual = 0;
		myCar.vMaxima = 80;

		myCar.liga();

		myCar.acelera(20);
		System.out.println(myCar.vAtual);
		System.out.println(myCar.getMarcha());

	}
}

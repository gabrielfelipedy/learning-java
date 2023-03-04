public class GuardaObjetos {

	private static Object[] array = new Object[100];

	private static int posicao = 0;

	public void addObject(Object objeto) {

		this.array[this.posicao] = objeto;
		this.posicao++;
	}

	public Object getObject(int index) {

		return this.array[index];
	}

	public String toString() {

		return "isso é um array de contas";
	}
}

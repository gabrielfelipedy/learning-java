public class Print1 implements Runnable {

	private int id;

	public Print1(int id) {

		this.id = id;
	}

	public void run() {

		for(int i = 0; i < 10000; i++) {

			System.out.println("P: " + id + " n: " + i);
		}
	}
}

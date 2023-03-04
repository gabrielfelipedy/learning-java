class Threads {

	public static void main(String[] args) {


	Print1 p1 = new Print1(1);
	Thread t1 = new Thread(p1);
	t1.start();

	Print1 p2 = new Print1(2);
	Thread t2 = new Thread(p2);
	t2.start();
}
}

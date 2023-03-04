class MyClass {

	int iden = 2;

	public void testa() {

		System.out.println("Rodou");
	}

	public String toString() {

		return "This is an account";
	}

	public boolean equals(Object o)
	{
		if(!(o instanceof MyClass)) return false;

		MyClass object = (MyClass) o;

		return this.iden == object.iden;

	}
}

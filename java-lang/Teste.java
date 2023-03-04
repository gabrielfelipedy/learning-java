class Teste {

	public static void main(String[] args) {


		GuardaObjetos g = new GuardaObjetos();
		MyClass m = new MyClass();

		g.addObject(m);
		System.out.println(g.getObject(0));

		Object object = g.getObject(0);

		MyClass retorno = (MyClass) object;
		retorno.testa();

		//Testar o toString
		System.out.println(retorno + "Outra string: " + g);

		MyClass an = new MyClass();
		an.iden = 78;
		System.out.println(retorno.equals(an));
	}
}

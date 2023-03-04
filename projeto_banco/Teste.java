class Teste {

	public static void main(String[] args){

		Conta account = new Conta();

		account.deposita(750);
		account.saca(5000);

		System.out.println(account.getSaldo());
	}
}

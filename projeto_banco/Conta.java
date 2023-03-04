public class Conta {

	private static int totalDeContas;

	private double saldo;
	private double limite;

	public Conta()
	{
		Conta.totalDeContas += 1;

		System.out.println("Conta criada");
	}

	//Getters e setters

	public int getTotalDeContas()
	{
		return Conta.totalDeContas;
	}

	public double getSaldo()
	{
		return this.saldo + this.limite;
	}

	public void setLimite(double valor)
	{
		this.limite = valor;
	}

	private void podeSacar(double quantidade) throws SaldoInsuficienteException
	{
		if(quantidade > this.saldo + this.limite)
			throw new SaldoInsuficienteException("Saldo Insuficiente");
	}

	public void saca(double quantidade)
	{
		try {
			podeSacar(quantidade);
			this.saldo -= quantidade;
		} catch (SaldoInsuficienteException e)
		{
			System.out.println(e.getMessage());
		}
	}

	public void deposita(double quantidade)
	{
		this.saldo += quantidade;
	}
}

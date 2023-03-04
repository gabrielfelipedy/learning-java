class Gerente extends Funcionario implements Autenticavel
{
	private int senha;
	int funcionariosGerenciados;

	public boolean autentica(int senha)
	{
		if (this.senha == senha) return true;

		return false;
	}
}

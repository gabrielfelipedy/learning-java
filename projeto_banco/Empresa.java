class Empresa {


	String nome;
	String cnpj;
	Funcionario[] empregados = new Funcionario[10];
	int posicaoVazia = 0;

	void adicionaFuncionario(Funcionario f)
	{

		if(this.posicaoVazia == this.empregados.length)
			System.out.println("\nVagas ocupadas");
		else {

			this.empregados[this.posicaoVazia] = f;
			this.posicaoVazia++;
		}
	}

	void mostraEmpregados() {

		for(Funcionario x : this.empregados) {

			x.mostra();
		}
	}
}

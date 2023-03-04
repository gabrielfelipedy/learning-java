abstract class Funcionario {

	protected String nome;
	protected String cpf;
	protected double salario = 5000;

	Data dataEntrada = new Data();

	double recebeAumento(double porcentagem) {

		this.salario = this.salario * ((porcentagem / 100) + 1);
		return this.salario;
	}

	double calculaGanhoAnual() {

		return this.salario * 12;
	}

	void mostra() {

		System.out.println("\nNome: " + this.nome);
		System.out.println("Salário: " + this.salario);
		System.out.println("Data de entrada: " + this.dataEntrada.formatada());
		System.out.println("Ganho anual: " + this.calculaGanhoAnual());

	}
}

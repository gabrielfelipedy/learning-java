class Quadrado implements AreaCalculavel
{
	private double lado;

	public Quadrado(double lado)
	{
		this.lado = lado;
	}

	public double calculaArea()
	{
		return this.lado * this.lado;
	}

}

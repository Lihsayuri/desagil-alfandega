package br.edu.insper.desagil.alfandega;

public class ItemTarifado extends ItemGeral{
	private String nome;
	private double valor;
	private double rate;
	private double tarifa;

	public ItemTarifado(String nome, double valor, double rate, double tarifa) {
		this.nome = nome;
		this.valor = valor;
		this.rate = rate;
		this.tarifa = tarifa;
	}

	public String getNome() {
		return this.nome;
	}

	@Override
	public double getValor() {
		return this.valor;
	}

	@Override
	public double getRate() {
		return this.rate;
	}

	@Override
	public double getTarifa() {
		return this.tarifa;
	}
}

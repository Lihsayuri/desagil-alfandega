package br.edu.insper.desagil.alfandega;

public class Item extends ItemGeral {
	private String nome;
	private double valor;
	private double rate;

	public Item(String nome, double valor, double rate) {
		this.nome = nome;
		this.valor = valor;
		this.rate = rate;
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
		return 0.01;
	}
}

package br.edu.insper.desagil.alfandega;

import java.util.ArrayList;
import java.util.List;

public class Alfandega {
	private List<ItemGeral> itens;

	public Alfandega() {
		this.itens = new ArrayList<>();
	}

	public void declara(ItemGeral item) {
		this.itens.add(item);
	}

	public double getTotalDeclarado() {
		double total = 0.0;
		for (ItemGeral item : this.itens) {
			total += item.getRate() * item.getValor();
		}
		return total;
	}

	public double getTotalDevido() {
		double total = 0.0;
		for (ItemGeral item : this.itens) {
			// Mesmo em itens sem tarifa, a alfândega cobra
			// uma taxa de 1% Por quê? Porque eles podem.
			total += item.getRate() * item.getValor() * item.getTarifa();
		}
		return total;
	}
}

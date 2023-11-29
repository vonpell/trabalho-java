// Classe Configuracao - String nome - ok
// Configuracao (n: String) - ok
// getNome(): String - ok
// getComputadores(): List<Computador> - ok
// adicionaItemQuant(m: Modelo, quant: item): ItemQuant
// removeItemQuant(i: ItemQuant): void
// potencia(): float - ok
// listItemQuant(): List<ItemQuant> - ok
// #addComputador(c: Computador): void
// #removeComputador(c: Computador): void

import java.util.ArrayList;
import java.util.List;

public class Configuracao {

	private String nome;
	private List<ItemQuant> listItemQuant = new ArrayList<ItemQuant>();
	private List<Computador> listComputadores = new ArrayList<Computador>();

	public Configuracao(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null) {
			throw new RuntimeException("Erro Configuração: nome não pode ser null");
		} else if (nome.isEmpty()) {
			throw new RuntimeException("Erro Configuração: nome não pode ser vazio");
		} else {
			this.nome = nome;
		}
	}

	public List<Computador> getComputadores() {
		return listComputadores;
	}

	public List<ItemQuant> listItemQuant() {
		return listItemQuant;
	}

	public void adicionaItemQuant(Modelo m, int quant) { // precisa ter return esse método? porquê?
		ItemQuant novoItem = new ItemQuant(m, quant, this);
		if (m == null || quant <= 0) {
			throw new RuntimeException("Erro: modelo e/ou quantidade não podem ser null ou vazios");
		} else {
			this.listItemQuant.add(novoItem);
		}
	}

	public void removeItemQuant(ItemQuant i) {
		if (i == null) {
			throw new RuntimeException("Erro adiciona Computador: c não pode ser null");
		} else {
			this.listItemQuant.remove(i);
		}
	}

	public float getPotencia() {
		float soma = 0;
		for (ItemQuant itemQuant : listItemQuant) {
			soma = soma + itemQuant.getPotencia();
		}
		return soma;
	}

	protected void addComputador(Computador c) {
		if (c == null) {
			throw new RuntimeException("Erro adiciona Computador: c não pode ser null");
		} else {
			this.listComputadores.add(c);
		}
	}

	protected void removeComputador(Computador c) {
		if (c == null) {
			throw new RuntimeException("Erro remove Computador: c não pode ser null");
		} else {
			this.listComputadores.remove(c);
		}
	}
}

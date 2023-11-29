// Classe Laboratório - int numero
// Laboratório (n: int)
// getNumero(): int
// adicionaComputador (c: Computador): void
// removeComputador (c: Computador): void
// getComputadores(): List<Computador>
// quantComputadores(): int
// potenciaTotal(): float

import java.util.ArrayList;
import java.util.List;

public class Laboratorio {
	private int numero;
	private List<Computador> listComputadores = new ArrayList<Computador>();
	private int qtdComputadores;

	public Laboratorio(int numero) {
		this.setNumero(numero);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			throw new RuntimeException("Erro: Laboratório não deve ter um número negativo");
		} else {
			this.numero = numero;
		}
	}

	public List<Computador> getComputadores() {
		return listComputadores;
	}

	public void adicionaComputador(Computador computador) {
		if (computador == null) {
			throw new RuntimeException("Erro: Computador não pode ser nulo");
		} else {
			this.listComputadores.add(computador);
			qtdComputadores += 1;
		}
	}

	public void removeComputador(Computador computador) {
		if (computador == null) {
			throw new RuntimeException("Erro: Computador não pode ser nulo");
		} else {
			this.listComputadores.remove(computador);
			qtdComputadores -= 1;
		}
	}

	public int quantComputadores() {
		return qtdComputadores;
	}

	public float potenciaTotal() {
		float potenciaTotal = 0;
		for (Computador computador : listComputadores) {
			potenciaTotal = potenciaTotal + computador.getPotencia();
		}
		return potenciaTotal;
	}
}

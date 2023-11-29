// Classe Modelo - String nome, float potencia
// Modelo (String nome, float potencia, Tipo t, Marca marca)
// getNome(): String
// getPotencia(): float
// getConfiguracao(): List<Configuracao>(): void
// protected addItemQuant(ItemQuant i): void
// protected removeItemQuant(ItemQuant i): void

import java.util.ArrayList;
import java.util.List;

public class Modelo {

	private String nome;
	private float potencia;
	private List<ItemQuant> itemQuant = new ArrayList<ItemQuant>();
	private List<Configuracao> listConfiguracao = new ArrayList<Configuracao>();
	private Tipo tipo;
	private Marca marca;

	public Modelo(String nome, float potencia, Tipo tipo, Marca marca) {
		this.setNome(nome);
		this.setPotencia(potencia);
		this.setTipo(tipo);
		this.setMarca(marca);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null) {
			throw new RuntimeException("Erro Nome Modelo: nome não pode ser null");
		} else if (nome.isEmpty()) {
			throw new RuntimeException("Erro Nome Modelo: nome não pode ser vazio");
		} else {
			this.nome = nome;
		}
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		if (potencia <= 0) {
			throw new RuntimeException("Erro Potência Modelo: potência não pode ser zero ou negativa");
		} else {
			this.potencia = potencia;
		}
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		if (tipo == null) {
			throw new RuntimeException("Erro Tipo: tipo não pode ser null");
		} else {
			this.tipo = tipo;
		}
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		if (marca == null) {
			throw new RuntimeException("Erro Marca: marca não pode ser null");
		} else {
			this.marca = marca;
		}
	}

	public List<Configuracao> getConfiguracoes() {
		return listConfiguracao;
	}

	protected void addItemQuant(ItemQuant i) {
		if (i == null) {
			throw new RuntimeException("Erro adiciona ItemQuant: quantidade não pode ser null");
		} else {
			this.itemQuant.add(i);
		}
	}

	protected void removeItemQuant(ItemQuant i) {
		if (i == null) {
			throw new RuntimeException("Erro remove ItemQuant: quantidade não pode ser null");
		} else {
			this.itemQuant.remove(i);
		}
	}
}

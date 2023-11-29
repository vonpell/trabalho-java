// Classe ItemQuant - int quant
// protected ItemQuant (m: Modelo, quant: int, conf: configuracao)
// getQuant(): int
// getModelo(): Modelo
// getConfiguracao(): Configuracao
// potencia(): float
// protected setConfiguracao(c: Configuracao): void

public class ItemQuant {

	private int quant;
	private Modelo modelo;
	private Configuracao configuracao;

	protected ItemQuant(Modelo modelo, int quant, Configuracao configuracao) {
		this.setModelo(modelo);
		this.setQuant(quant);
		this.setConfiguracao(configuracao);
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		if (quant <= 0) {
			throw new RuntimeException("Erro Quantidade: quantidade não pode ser zero ou negativa");
		} else {
			this.quant = quant;
		}
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		if (modelo == null) {
			throw new RuntimeException("Erro Modelo: modelo não pode ser null");
		} else {
			this.modelo = modelo;
		}
	}

	public float getPotencia() {
		return (this.quant * this.modelo.getPotencia());
	}

	public Configuracao getConfiguracao() {
		return configuracao;
	}

	protected void setConfiguracao(Configuracao configuracao) {
		if (configuracao == null) {
			throw new RuntimeException("Erro Configuração: configuração não pode ser null");
		} else {
			this.configuracao = configuracao;
		}
	}

}

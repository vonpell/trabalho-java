// Classe ItemQuant - int quant
// protected ItemQuant (m: Modelo, quant: int, conf: configuracao)
// getQuant(): int
// getModelo(): Modelo
// getConfiguracao(): Configuracao
// potencia(): float
// protected setConfiguracao(c: Configuracao): void

public class ItemQuant {

    private int quant;
    private float potencia;
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
        this.quant = quant;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public Configuracao getConfiguracao() {
        return configuracao;
    }

    protected void setConfiguracao(Configuracao configuracao) {
        this.configuracao = configuracao;
    }

}

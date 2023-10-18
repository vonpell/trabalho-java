// Classe Computador - int serial
// Computador (s: String, conf: Configuração)
// getSerial(): String
// getConfiguração(): Configuração
// setConfiguração (conf: Configuração): void
// potencia(): float

public class Computador {

    private String serial;
    private Configuracao configuracao;
    private float potencia;
    private int laboratorio;

    public Computador(String serial, Configuracao configuracao, int laboratorio) {
        this.setSerial(serial);
        this.setConfiguracao(configuracao);
        this.setLaboratorio(laboratorio);
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        if (serial == null) {
            throw new RuntimeException("Erro Serial: serial não pode ser null");
        } else if (serial.isEmpty()) {
            throw new RuntimeException("Erro Serial: serial não pode ser vazio");
        } else {
            this.serial = serial;
        }
    }

    public Configuracao getConfiguração() {
        return configuracao;
    }

    public void setConfiguracao(Configuracao configuracao) {
        if (configuracao == null) {
            throw new RuntimeException("Erro Configuração: configuração não pode ser null");
        } else {
            this.configuracao = configuracao;
        }
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public int getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(int laboratorio) {
        this.laboratorio = laboratorio;
    }
}

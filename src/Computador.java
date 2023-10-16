// Classe Computador - int serial
// Computador (s: String, conf: Configuração)
// getSerial(): String
// getConfiguração(): Configuração
// setConfiguração (conf: Configuração): void
// potencia(): float

public class Computador {

    private String serial;
    private Configuracao nome;
    private float potencia;

    public Computador(String serial, Configuracao configuracao) {
        this.setSerial(serial);
        this.setConfiguracao(configuracao);
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
        return nome;
    }
    public void setConfiguracao(Configuracao configuracao) {
        this.nome = configuracao;
    }

    public float getPotencia() {
        return potencia;
    }

    public float setPotencia(float potencia) {
        this.potencia = potencia;
    }

}

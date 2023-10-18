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
    private List<Configuracao> configuracao = new ArrayList<Configuracao>();
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

    public float getPotencia() {
        return potencia;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public void setTipo(Tipo tipo) {
        if (tipo == null) {
            throw new RuntimeException("Erro Tipo: tipo não pode ser null");
        } else {
            this.tipo = tipo;
        }
    }

    public void setMarca(Marca marca) {
        if (marca == null) {
            throw new RuntimeException("Erro Marca: marca não pode ser null");
        } else {
            this.marca = marca;
        }
    }

    public List<Configuracao> getConfiguracao() {
        return configuracao;
    }

    protected void addItemQuant(ItemQuant i) {
        if (i == null) {
            throw new RuntimeException("Erro adiciona ItemQuant: i não pode ser null");
        } else {
            this.itemQuant.add(i);
        }
    }

    protected void removeItemQuant(ItemQuant i) {
        if (i == null) {
            throw new RuntimeException("Erro remove ItemQuant: i não pode ser null");
        } else {
            this.itemQuant.remove(i);
        }
    }
}

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
    private int quant;
    private float potencia;
    private List<ItemQuant> itemQuant = new ArrayList<ItemQuant>();
    private List<Computador> computadores = new ArrayList<Computador>();
    private Computador computador;

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
        return computadores;
    }

    public List<ItemQuant> getItemQuant() {
        return itemQuant;
    }



    // adicionaItemQuant(m: Modelo, quant: item): ItemQuant
    // removeItemQuant(i: ItemQuant): void

    public float getPotencia() {
        return potencia;
    }

    public float setPotencia(float potencia) {
        this.potencia = potencia;
    }
}

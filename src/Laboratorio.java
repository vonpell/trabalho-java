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
    private List<Computador> computadores = new ArrayList<Computador>();
    private float potenciaTotal;
    private int qtdComputadores;

    private Computador computador; // Linkando com classe Computador

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
        return computadores;
    }

    //quando remover um computador, implementar qtdcomputadores +1
    public void adicionaComputador(Computador computador) {
        if (computador == null) {
            throw new RuntimeException("Erro: Computador não pode ser nulo");
        } else {
            this.computadores.add(computador);
            qtdComputadores += 1;
        }
    }

    public void removeComputador(Computador computador) {
        if (computador == null) {
            throw new RuntimeException("Erro: Computador não pode ser nulo");
        } else {
            this.computadores.remove(computador);
            qtdComputadores -= 1;
        }
    }

    public int quantComputadores() {
        return qtdComputadores;
    }

    // na classe computadores, método potência, aidicionar um potencialTotal += nova potência?
    public float potenciaTotal() {
        return potenciaTotal;
    }
}

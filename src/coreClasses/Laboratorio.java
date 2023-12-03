// Classe Laboratório - int numero
// Laboratório (n: int)
// getNumero(): int
// adicionaComputador (c: coreClasses.Computador): void
// removeComputador (c: coreClasses.Computador): void
// getComputadores(): List<coreClasses.Computador>
// quantComputadores(): int
// potenciaTotal(): float

package coreClasses;

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

    public void getInfosLab(Laboratorio laboratorio) {
        for (Computador computador : listComputadores) {
            System.out.println("");
            System.out.println("Computador serial: " + computador.getSerial());
            for (ItemQuant itemQuant : computador.getConfiguracao().listItemQuant()) {
                System.out.println("-");
                System.out.println("Modelo: " + itemQuant.getModelo().getNome());
                System.out.println("Quantidade: " + itemQuant.getQuant());
                System.out.println("Tipo: " + itemQuant.getModelo().getTipo().getNome());
                System.out.println("Marca: " + itemQuant.getModelo().getMarca().getNome());
            }
        }
    }

    public void getLabByModelo(Modelo modelo) {
        for (Computador computador: listComputadores) {
            for (ItemQuant itemQuant: computador.getConfiguracao().listItemQuant()) {
                if (itemQuant.getModelo() == modelo) {
                    System.out.println("Computador serial: " + computador.getSerial() + " possui esse modelo.");
                    System.out.println("Computador está no laboratório: " + this.numero);
                }
            }
        }
    }


    public void adicionaComputador(Computador computador) {
        if (computador == null) {
            throw new RuntimeException("Erro: coreClasses.Computador não pode ser nulo");
        } else {
            this.listComputadores.add(computador);
            qtdComputadores += 1;
        }
    }

    public void removeComputador(Computador computador) {
        if (computador == null) {
            throw new RuntimeException("Erro: coreClasses.Computador não pode ser nulo");
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

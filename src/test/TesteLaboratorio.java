/* Funcionalidades da Aplicação:
        1) Cadastrar Tipo.
        2) Cadastrar Marca.
        3) Cadastar Modelo.
        4) Cadastrar Laboratorio.
        5) Criar uma Configuracao.
        6) Adicionar Item na Configuracao.
        7) Cadastrar um Computador em um Laboratorio. Computador precisará ter uma determinada
        Configuracao.
        8) Listar todos os Itens contidos em um Laboratorio: computadores (numero serial) com seus itens
        (quantidade, modelo, tipo, marca).
        9) Mostrar a potencia total consumida em um determinado Laboratorio.
        10) Trocar a Configuracao de um Computador. Não é para mudar os Itens de uma Configuracao, é
        para escolher uma outra Configuracao e atribuir para um computador.
        11) A partir de um Modelo, mostrar todos os laboratórios que tenham algum item desse modelo
        (mostrar número serial dos computadores que tenham item desse modelo).
 */

package test;

import coreClasses.*;

import java.util.ArrayList;
import java.util.List;

public class TesteLaboratorio {

    public static void main(String[] args) {

        // Questão 1:

        Tipo processador, placaVideo, armazenamentoHD, armazenamentoSSD;

        processador = new Tipo("Processador");
        placaVideo = new Tipo("Placa de vídeo");
        armazenamentoHD = new Tipo("HD");
        armazenamentoSSD = new Tipo("SSD");

        // Questão 2:

        Marca Intel, AMD, ASUS, ZOTAC, Seagate, Kingston;

        Intel = new Marca("Intel");
        AMD = new Marca("AMD");
        ASUS = new Marca("ASUS");
        ZOTAC = new Marca("ZOTAC");
        Seagate = new Marca("Seagate");
        Kingston = new Marca("Kingston");

        // Questão 3:

        Modelo i5, i7, ryzen5, ryzen7, ASUS2060, ZOTAC4060, HDBarracuda, SSDKingston;

        i5 = new Modelo("i5 11450F", 70, processador, Intel);
        i7 = new Modelo("i7 10700K", 95, processador, Intel);
        ryzen5 = new Modelo("Ryzen 5 5600X", 65, processador, AMD);
        ryzen7 = new Modelo("Ryzen 7 5800X", 105, processador, AMD);
        ASUS2060 = new Modelo("DUAL-RTX2060-6GB-EVO", 160, placaVideo, ASUS);
        ZOTAC4060 = new Modelo("Zotac GeForce RTX 4060", 115, placaVideo, ZOTAC);
        HDBarracuda = new Modelo("HD Seagate 1 TB SATA ST1000DM010", 5.3F, armazenamentoHD, Seagate);
        SSDKingston = new Modelo("SSD 1 TB Kingston Fury Renegade SFYRS", 6.3F, armazenamentoSSD, Kingston);

        // Questão 4:

        Laboratorio lab1, lab2, lab3;

        lab1 = new Laboratorio(101);
        lab2 = new Laboratorio(102);
        lab3 = new Laboratorio(103);

        // Questão 5:

        Configuracao media1, media2, alta1, alta2;

        media1 = new Configuracao("Config media performance Intel");
        media2 = new Configuracao("Config media performance AMD");
        alta1 = new Configuracao("Config alta performance Intel");
        alta2 = new Configuracao("Config alta performance AMD");

        // Questão 6:

        media1.adicionaItemQuant(i5, 1);
        media1.adicionaItemQuant(ASUS2060, 1);
        media1.adicionaItemQuant(HDBarracuda, 2);

        media2.adicionaItemQuant(ryzen5, 1);
        media2.adicionaItemQuant(ASUS2060, 1);
        media2.adicionaItemQuant(HDBarracuda, 2);

        alta1.adicionaItemQuant(i7, 1);
        alta1.adicionaItemQuant(ZOTAC4060, 1);
        alta1.adicionaItemQuant(HDBarracuda, 1);
        alta1.adicionaItemQuant(SSDKingston, 1);

        alta2.adicionaItemQuant(ryzen7, 1);
        alta2.adicionaItemQuant(ZOTAC4060, 1);
        alta2.adicionaItemQuant(HDBarracuda, 1);
        alta2.adicionaItemQuant(SSDKingston, 1);

        // Questão 7:

        Computador c1, c2, c3, c4, c5;

        c1 = new Computador("0001", alta1);
        c2 = new Computador("0002", media1);
        c3 = new Computador("0003", media2);
        c4 = new Computador("0004", alta2);
        c5 = new Computador("0005", alta1);

        lab1.adicionaComputador(c1);
        lab1.adicionaComputador(c3);
        lab2.adicionaComputador(c2);
        lab2.adicionaComputador(c5);
        lab3.adicionaComputador(c4);

        // Questão 8:
        // Construí um método chamado getInfosLab() dentro de Laboratório para retornar os dados solicitados.

        System.out.println("Questão 8.");
        System.out.println("Laboratório 101: ");
        lab1.getInfosLab(lab1);


        /* for (Laboratorio laboratorio : listLaboratorios) {
            System.out.println("");
            System.out.println("Laboratório: " + laboratorio.getNumero());
            laboratorio.getInfosLab();
        } */

        // Questão 9:

        System.out.println("");
        System.out.println("Questão 9.");
        System.out.println("Potência Total Lab 101: " + lab1.potenciaTotal());
        System.out.println("Potência Total Lab 102: " + lab2.potenciaTotal());
        System.out.println("Potência Total Lab 103: " + lab3.potenciaTotal());

        // Questão 10:

        System.out.println("");
        System.out.println("Questão 10.");
        System.out.println("Config anterior computador c1: " + c1.getConfiguracao().getNome());
        c1.setConfiguracao(alta2);
        System.out.println("Config atual computador c1, pós mudança: " + c1.getConfiguracao().getNome());

        // Questão 11:
        // Construí um método chamado getLabByModelo() dentro de Laboratório para retornar os dados solicitados.

        List<Laboratorio> listLaboratorios = new ArrayList<Laboratorio>();
        listLaboratorios.add(lab1);
        listLaboratorios.add(lab2);
        listLaboratorios.add(lab3);

        System.out.println("");
        System.out.println("Questão 11.");
        System.out.println("Modelo: " + HDBarracuda.getNome());
        for (Laboratorio laboratorio : listLaboratorios) {
            laboratorio.getLabByModelo(HDBarracuda);
        }

        System.out.println("");
        System.out.println("Modelo: " + ASUS2060.getNome());
        for (Laboratorio laboratorio : listLaboratorios) {
            laboratorio.getLabByModelo(ASUS2060);
        }
    }
}

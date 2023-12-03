package screens;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import coreClasses.*;

public class Screen02 {

    protected static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Tipo processador, placaVideo, armazenamentoHD, armazenamentoSSD;

        processador = new Tipo("Processador");
        placaVideo = new Tipo("Placa de vídeo");
        armazenamentoHD = new Tipo("HD");
        armazenamentoSSD = new Tipo("SSD");


        Marca Intel, AMD, ASUS, ZOTAC, Seagate, Kingston;

        Intel = new Marca("Intel");
        AMD = new Marca("AMD");
        ASUS = new Marca("ASUS");
        ZOTAC = new Marca("ZOTAC");
        Seagate = new Marca("Seagate");
        Kingston = new Marca("Kingston");


        Modelo i5, i7, ryzen5, ryzen7, ASUS2060, ZOTAC4060, HDBarracuda, SSDKingston;

        i5 = new Modelo("i5 11450F", 70, processador, Intel);
        i7 = new Modelo("i7 10700K", 95, processador, Intel);
        ryzen5 = new Modelo("Ryzen 5 5600X", 65, processador, AMD);
        ryzen7 = new Modelo("Ryzen 7 5800X", 105, processador, AMD);
        ASUS2060 = new Modelo("DUAL-RTX2060-6GB-EVO", 160, placaVideo, ASUS);
        ZOTAC4060 = new Modelo("Zotac GeForce RTX 4060", 115, placaVideo, ZOTAC);
        HDBarracuda = new Modelo("HD Seagate 1 TB SATA ST1000DM010", 5.3F, armazenamentoHD, Seagate);
        SSDKingston = new Modelo("SSD 1 TB Kingston Fury Renegade SFYRS", 6.3F, armazenamentoSSD, Kingston);


        Laboratorio lab1, lab2, lab3, lab4, labTeste;

        lab1 = new Laboratorio(101);
        lab2 = new Laboratorio(102);
        lab3 = new Laboratorio(103);
        lab4 = new Laboratorio(104);
        labTeste = lab4;

        List<Laboratorio> listLaboratorios = new ArrayList<Laboratorio>();
        listLaboratorios.add(lab1);
        listLaboratorios.add(lab2);
        listLaboratorios.add(lab3);


        Configuracao media1, media2, alta1, alta2;

        media1 = new Configuracao("Config media performance Intel");
        media2 = new Configuracao("Config media performance AMD");
        alta1 = new Configuracao("Config alta performance Intel");
        alta2 = new Configuracao("Config alta performance AMD");


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


        System.out.println("Laboratórios disponíveis: ");
        for (Laboratorio laboratorio : listLaboratorios) {
            System.out.println("Lab " + laboratorio.getNumero());
        }
        System.out.println();
        System.out.println("Digite o laboratório que você gostaria de consultar: ");
        int labConsulta = scan.nextInt();
        scan.nextLine();

        int teste = 0;

        for (Laboratorio laboratorio : listLaboratorios) {
            if (labConsulta == laboratorio.getNumero()) {
                teste = 1;
                labTeste = laboratorio;
                labTeste.getInfosLab(labTeste);
            }
        }

        if (teste == 0) {
            System.out.println("Laboratório não cadastrado.");
        }
    }
}

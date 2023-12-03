package screens;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import coreClasses.*;

public class Screen01 {

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

        List<Modelo> modelosList = new ArrayList<Modelo>();
        modelosList.add(i5);
        modelosList.add(i7);
        modelosList.add(ryzen5);
        modelosList.add(ryzen7);
        modelosList.add(ASUS2060);
        modelosList.add(ZOTAC4060);
        modelosList.add(HDBarracuda);
        modelosList.add(SSDKingston);

        Laboratorio lab1, lab2, lab3, labExistente;

        lab1 = new Laboratorio(101);
        lab2 = new Laboratorio(102);
        lab3 = new Laboratorio(103);
        labExistente = lab1;

        Configuracao media1, media2, alta1, alta2, configExistente, configNova;

        media1 = new Configuracao("Config media performance Intel");
        media2 = new Configuracao("Config media performance AMD");
        alta1 = new Configuracao("Config alta performance Intel");
        alta2 = new Configuracao("Config alta performance AMD");
        configExistente = media1;

        List<Configuracao> listConfig = new ArrayList<Configuracao>();
        listConfig.add(media1);
        listConfig.add(media2);
        listConfig.add(alta1);
        listConfig.add(alta2);


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

        Computador c1, c2, c3, c4, c5, c6, c7;

        c1 = new Computador("0001", alta1);
        c2 = new Computador("0002", media1);
        c3 = new Computador("0003", media2);
        c4 = new Computador("0004", alta2);
        c5 = new Computador("0005", alta1);
        c6 = new Computador("0006", media1);

        List<Computador> listComps = new ArrayList<Computador>();
        listComps.add(c1);
        listComps.add(c2);
        listComps.add(c3);
        listComps.add(c4);
        listComps.add(c5);

        lab1.adicionaComputador(c1);
        lab1.adicionaComputador(c3);
        lab2.adicionaComputador(c2);
        lab2.adicionaComputador(c5);
        lab3.adicionaComputador(c4);

        List<Laboratorio> listLaboratorios = new ArrayList<Laboratorio>();
        listLaboratorios.add(lab1);
        listLaboratorios.add(lab2);
        listLaboratorios.add(lab3);

        int teste = 0;

        System.out.println("Você gostaria de: ");
        System.out.println("1 - Adicionar uma configuração existente ou");
        System.out.println("2 - Adicionar uma nova configuração");
        System.out.println("Digite: ");
        float f = scan.nextFloat();
        scan.nextLine();
        if (f != 1 && f != 2) {
            System.out.println("Opção inválida.");
        } else if (f == 1) {
            System.out.println("Configurações disponíveis:");
            for (Configuracao configuracao : listConfig) {
                System.out.println(configuracao.getNome());
            }
            System.out.println();
            System.out.println("Digite a configuração escolhida exatamente como a listada: ");
            String conf = scan.nextLine();

            for (Configuracao configuracao : listConfig) {
                if (conf.equals(configuracao.getNome())) {
                    configExistente = configuracao;
                    c6.setConfiguracao(configExistente);
                    teste = 0;
                    break;
                } else {
                    teste = 1;
                }
            }

            if (teste == 1) {
                System.out.println("Config não encontrada.");
                System.out.println("Config default aplicada: " + configExistente.getNome());
            } else {
                System.out.println("Config escolhida: " + configExistente.getNome());
            }
            teste = 0;

            System.out.println();

            System.out.println("Agora vamos cadastrar um novo computador com essa configuração.");
            System.out.println("Digite o número serial: ");

            String seri = scan.nextLine();

            for (Computador computador : listComps) {
                if (seri.equals(computador.getSerial())) {
                    System.out.println("Número serial já existe.");
                    teste = 1;
                }
            }

            if (teste == 1) {
                seri = c6.getSerial();
                System.out.println("Serial aplicado: " + seri);
            } else {
                c6.setSerial(seri);
                System.out.println("Serial armazenado: " + c6.getSerial());
            }
            teste = 0;

            System.out.println();

            System.out.println("Agora vamos cadastrar esse computador em um Laboratório.");
            System.out.println("Laboratórios disponíveis: ");
            for (Laboratorio laboratorio : listLaboratorios) {
                System.out.println("Laboratório " + laboratorio.getNumero());
            }
            System.out.println("Digite o labatório escolhido: ");
            int lab = scan.nextInt();
            scan.nextLine();

            for (Laboratorio laboratorio : listLaboratorios) {
                if (lab == laboratorio.getNumero()) {
                    teste = 1;
                    labExistente.setNumero(lab);
                    break;
                }
            }

            if (teste == 1) {
                labExistente.adicionaComputador(c6);
                System.out.println("Computador adicionado ao lab: " + labExistente.getNumero());
            } else {
                System.out.println("Lab não encontrado. Lab default aplicado.");
                System.out.println("Computador adicionado ao lab: " + labExistente.getNumero());
            }
        } else {
            System.out.println("Vamos adicionar uma nova configuração.");
            System.out.println();

            System.out.println("Digite o nome da nova configuração: ");
            String novaConf = scan.nextLine();

            configNova = new Configuracao(novaConf);

            System.out.println();
            System.out.println("Agora vamos adicionar itens à configuração");



            int resposta = 1;
            while (resposta == 1) {

            }

        }
    }
}

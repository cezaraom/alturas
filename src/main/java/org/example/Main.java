package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.println("Nome: ");
            nomes[i] = sc.next();
            System.out.println("Idade: ");
            idades[i] = sc.nextInt();
            System.out.println("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        double somaAlturas = 0;

        for (int i = 0; i < n; i++) {
            somaAlturas += alturas[i];
        }
        double alturaMedia = somaAlturas / n;

        System.out.printf("Altura média: %.2f%n", alturaMedia);

        int cont = 0;

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                cont++;
            }
        }
        double idadeMenorDeDezesseis = cont * 100 / n;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", idadeMenorDeDezesseis);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

    }
}
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        double[] temperaturas = new double[24];

        double temperatura = 0;
        double total = 0;
        double media = 0;
        final int HORAS=24;
        for (int i = 0; i < 24; i++) {


            System.out.print("Escribe la temperatura de las " +i+": ");
            temperatura = Double.parseDouble(br.readLine());

            total = (total + temperatura);
            media = total / HORAS;
            temperaturas[i] = temperatura;

            if (temperatura < min) {
                min = temperatura;
            } else if (temperatura > max) {
                max = temperatura;
            }
        }
        for (int i = 0; i < HORAS; i++) {
            System.out.print(i);

            System.out.print("  ");

            for (int j = 0; j < temperaturas[i]; j++) {
                System.out.print("*");
            }

            System.out.print(" ");

            System.out.print(temperaturas[i]);

            if (temperaturas[i] == max) {
                System.out.print("-->Max");
            }
            if (temperaturas[i] == min) {
                System.out.print("-->Min");
            }
            System.out.print("La media es: " + media);
            System.out.println();
        }
    }
}

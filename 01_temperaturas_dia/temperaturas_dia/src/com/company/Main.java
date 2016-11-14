package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int horas (int horas){
        return horas=horas+1;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] temperaturas = new double[24];
        double horas=0;

        for (int i = 0; i <24 ; i++) {
            horas =Integer.parseInt(br.readLine());
            System.out.println("Escribe la temperatura de las "+horas());
        }




    }
}

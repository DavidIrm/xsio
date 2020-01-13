package jocxsio;

import java.util.Scanner;

public class MainJoc {
    public static final int SEMN_X = 1;

    public static void main(String[] args) {
        Scanner tastatura = new Scanner(System.in);
        Tabla joc = new Tabla();
        System.out.println("Incepe Jocul!");
        joc.afisazaTabla();
        int linie, coloana;
        System.out.println("Primul jucator e cu X. Introdu' linie coloana: ");
        linie = tastatura.nextInt();
        coloana = tastatura.nextInt();
        joc.seteazaCelula(linie, coloana, SEMN_X);
        joc.afisazaTabla();
    }
}

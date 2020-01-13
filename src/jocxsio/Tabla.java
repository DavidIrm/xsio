package jocxsio;

import java.util.Dictionary;

public class Tabla {
    public static final int DIMENSIUNE_TABLA = 3;
    Celula[][] celule;
    public Tabla(){
        celule = new Celula[DIMENSIUNE_TABLA][DIMENSIUNE_TABLA]; // alocare tabla de joc
        for (int i = 0; i < DIMENSIUNE_TABLA; i++){
            for (int j = 0; j < DIMENSIUNE_TABLA; j++){
                celule[i][j] = new Celula(i, j);
            }
        }
    }
    public void seteazaCelula(int linie, int coloana, int valoare){
        celule[linie][coloana].marcheazaCelula(valoare);
    }
    public void afisazaTabla(){
        for (int i = 0; i < DIMENSIUNE_TABLA; i++){
            for (int j = 0; j < DIMENSIUNE_TABLA; j++){
                celule[i][j].deseneazaCelula();
                if (j < DIMENSIUNE_TABLA -1) {
                    System.out.print("|");
                }
            }
            if (i < DIMENSIUNE_TABLA -1) {
                System.out.printf("\n-----\n"); // trece la linia urmatoare
            }
        }
    }
}

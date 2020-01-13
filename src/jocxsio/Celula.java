package jocxsio;

public class Celula {
    private int valoare;
    private int linie, coloana;
    public Celula(int linie, int coloana){
        this.linie = linie;
        this.coloana = coloana;
        stergeCelula();
    }
    public void stergeCelula(){
        this.valoare = 0;
    }
    public void marcheazaCelula(int valoare){
        this.valoare = valoare;
    }
    public void deseneazaCelula(){
        switch(this.valoare){
            case 0:
                System.out.print(" ");
                break;
            case 1:
                System.out.print("X");
                break;
            case 2:
                System.out.print("O");
                break;
            default:
                System.out.println("Ai cam dat-o in bara ! :)");
        }
    }
}

import java.util.Scanner;

public class Caracter {
    String clasa;
    int id;
    int bani;
    int putere;
    int viteza;
    String abilitate;

    public Caracter(String clasa, int id, int bani, int putere, int viteza, String abilitate) {
        this.clasa = clasa;
        this.id = id;
        this.bani = bani;
        this.putere = putere;
        this.viteza = viteza;
        this.abilitate = abilitate;
    
    }

    public String toString() {
        return "Caracter " + id + ": " + clasa + " -Bani: " + bani + "-Putere" + putere + "-Viteza: "  + "-Abilitate:" + abilitate ;
    }
}
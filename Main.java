
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Caracter Caracter1 = new Caracter("Mercenar", 1, 250, 7, 8, "Evadare");
        Caracter Caracter2 = new Caracter("Cavaler", 2, 200, 9, 6, "Atac special");
        Caracter Caracter3 = new Caracter("Magician", 3, 150, 6, 9, "Invizibilitate");
        Caracter Caracter4 = new Caracter("Clasa speciala", 4, 0, 0, 0, "Abilitate Speciala");

        int optiuni;

        do {
            System.out.println("Meniu:");
            System.out.println("1. Start joc");
            System.out.println("2. Arata lista cu caracterele dupa clase");
            System.out.println("3. Creare Caracter");
            System.out.println("4. Iesire joc");
            System.out.print("Alege o optiune: ");
            optiuni = sc.nextInt();

            switch (optiuni) {
                case 1:
                    System.out.println("Joc inceput");
                    break;
                case 2:
                    // Afiseaza lista cu caracterele in functie de clase.
                    System.out.println("Lista de caractere:");
                    System.out.println(Caracter1);
                    System.out.println(Caracter2);
                    System.out.println(Caracter3);
                    break;
                    //Creare caracter custom
                case 3:
                    System.out.println("Creare Caracter");
                    System.out.println("Adauga bani");
                    int baniNoi = sc.nextInt();
                    System.out.println("Adauga putere");
                    int putereNoua = sc.nextInt();
                    System.out.println("Adauga viteza");
                    int vitezaNoua = sc.nextInt();
                    System.out.println("Caracterul nou: Clasa: " + Caracter4.clasa + ", id: " + Caracter4.id + ", Bani: " + baniNoi + ", Putere: " + putereNoua + ", Abilitate: " + Caracter4.abilitate);
                    break;
                    //Iesire joc
                case 4:
                    System.out.println("Iesire joc");
                    break;
                default:
                    System.out.println("Aege alta una dintre optiunile jocului");
                    break;
            }
        } while (optiuni != 4);
    }
}
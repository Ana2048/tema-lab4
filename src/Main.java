import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persoana persoana1 = new Persoana("Ion", 20);
        Persoana persoanaEgala = new Persoana("Ion", 20);
        Persoana persoana2 = new Persoana("Gheorghe", 30);
        Carte carte1 = new Carte("Harry Potter", "J.K. Rowling", 2000);
        Carte carte2 = new Carte("Moara cu noroc", "Ioan Slavici", 2001);
        Carte carte3 = new Carte("Povestea lui Harap Alb", "Ion Creanga", 2002);

        ArrayList<Carte> cartiPersoana1 = new ArrayList<>();
        cartiPersoana1.add(carte1);
        cartiPersoana1.add(carte2);

        ArrayList<Carte> cartiPersoana2 = new ArrayList<>();
        cartiPersoana2.add(carte3);

        persoana1.setCarti(cartiPersoana1);
        persoana2.setCarti(cartiPersoana2);

        // verificam metoda equals
        System.out.println(persoana1.equals(persoana2));

        System.out.println(persoana1.toString());
        System.out.println(persoana2.toString());

    }
}
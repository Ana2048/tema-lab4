import java.util.ArrayList;
import java.util.Objects;

public class Persoana {
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        String toPrint = "\u001B[33m" + nume + "\u001B[0m cu varsta de " + varsta + " ani" + " are cartile: \u001B[34m";
        int index = 0;
        for (Carte carte : carti) {
            if (index == carti.size() - 1) {
                toPrint += carte.getTitlu() + ".";
            } else {
                toPrint += carte.getTitlu() + ", ";
            }
            index++;
        }
        toPrint += "\u001B[0m";
        return toPrint;
    }

    public int getVarsta() {
        return varsta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoana = (Persoana) o;
        return varsta == persoana.varsta && Objects.equals(nume, persoana.nume);
    }//verificam daca obiectele sunt egale

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public ArrayList<Carte> getCarti() {
        return carti;
    }

    public void setCarti(ArrayList<Carte> carti) {
        this.carti = carti;
    }

    private int varsta;
    private ArrayList<Carte> carti;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        this.carti = new ArrayList<>();
    }
}

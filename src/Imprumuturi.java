import java.util.ArrayList;

public class Imprumuturi {

    private ArrayList<Carte> cartiImprumutate;
    private Persoana persoanaImprumutata;

    public Imprumuturi(ArrayList<Carte> cartiImprumutate, Persoana persoanaImprumutata) {
        this.cartiImprumutate = cartiImprumutate;
        this.persoanaImprumutata = persoanaImprumutata;
    }

    public ArrayList<Carte> getCartiImprumutate() {
        return cartiImprumutate;
    }

    public void setCartiImprumutate(ArrayList<Carte> cartiImprumutate) {
        this.cartiImprumutate = cartiImprumutate;
    }

    public Persoana getPersoanaImprumutata() {
        return persoanaImprumutata;
    }

    public void setPersoanaImprumutata(Persoana persoanaImprumutata) {
        this.persoanaImprumutata = persoanaImprumutata;
    }

    @Override
    public String toString() {
        String toPrint = persoanaImprumutata.getNume() + " a imprumutat cartile: ";
        int index = 0;
        for (Carte carte : cartiImprumutate) {
            if (index == cartiImprumutate.size() - 1) {
                toPrint += carte.getTitlu() + ".";
            } else {
                toPrint += carte.getTitlu() + ", ";
            }
            index++;
        }
        return toPrint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Imprumuturi imprumuturi = (Imprumuturi) o;
        return cartiImprumutate.equals(imprumuturi.cartiImprumutate) && persoanaImprumutata.equals(imprumuturi.persoanaImprumutata);
    }





}

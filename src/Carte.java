import java.util.Objects;

public class Carte {


    private String titlu;
    private String autor;
    private int anPublicare;

    public Carte(String titlu, String autor, int anPublicare) {
        this.titlu = titlu;
        this.autor = autor;
        this.anPublicare = anPublicare;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnPublicare() {
        return anPublicare;
    }

    public void setAnPublicare(int anPublicare) {
        this.anPublicare = anPublicare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carte carte = (Carte) o;
        return anPublicare == carte.anPublicare && Objects.equals(titlu, carte.titlu) && Objects.equals(autor, carte.autor);
    }

    @Override
    public String toString() {
        String toPrint = titlu + " scrisa de " + autor + " in anul " + anPublicare;
        return toPrint;
    }




}

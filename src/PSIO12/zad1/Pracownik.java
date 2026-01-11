package PSIO12.zad1;

import java.util.Objects;

public abstract class Pracownik {
    protected String nazwisko;
    protected double etat; // np. 0.5, 1.0, 1.25

    public Pracownik(String nazwisko, double etat) {
        this.nazwisko = nazwisko;
        this.etat = etat;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getEtat() {
        return etat;
    }

    public void setEtat(double etat) {
        this.etat = etat;
    }

    public abstract double obliczPlace();
    public abstract String getGrupa();

    @Override
    public String toString() {
        return nazwisko + ", " + getGrupa() + ", etat=" + etat;
    }

    // nazwisko jednoznacznie identyfikuje pracownika
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pracownik)) return false;
        Pracownik that = (Pracownik) o;
        return nazwisko.equals(that.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwisko);
    }
}

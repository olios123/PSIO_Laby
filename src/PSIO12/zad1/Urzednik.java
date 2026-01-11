package PSIO12.zad1;

public class Urzednik extends Pracownik {
    private double placaPodstawowa;
    private double premia; // np. 0.2 = 20%

    public Urzednik(String nazwisko, double etat, double placaPodstawowa, double premia) {
        super(nazwisko, etat);
        this.placaPodstawowa = placaPodstawowa;
        this.premia = premia;
    }

    @Override
    public double obliczPlace() {
        double podstawa = placaPodstawowa * etat;
        return podstawa * (1 + premia);
    }

    @Override
    public String getGrupa() {
        return "Urzędnik";
    }
}


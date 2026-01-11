package PSIO12.zad1;

public class Robotnik extends Pracownik {
    private double stawkaGodzinowa;
    private int godziny;
    public static final int LIMIT_GODZIN = 160; // dla pełnego etatu

    public Robotnik(String nazwisko, double etat, double stawkaGodzinowa, int godziny) {
        super(nazwisko, etat);
        this.stawkaGodzinowa = stawkaGodzinowa;
        this.godziny = godziny;
    }

    @Override
    public double obliczPlace() {
        int limit = (int)(LIMIT_GODZIN * etat);

        if (godziny <= limit) {
            return godziny * stawkaGodzinowa;
        } else {
            int nadgodziny = godziny - limit;
            return limit * stawkaGodzinowa +
                    nadgodziny * stawkaGodzinowa * 1.5;
        }
    }

    @Override
    public String getGrupa() {
        return "Robotnik";
    }
}

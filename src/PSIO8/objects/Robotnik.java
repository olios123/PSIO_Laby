package PSIO8.objects;

public class Robotnik extends Pracownik {

	private double stawkaGodzinowa;
	private int liczbaGodzin;
	private int limitGodzin = 160;

	public Robotnik(String nazwisko, double etat, double stawkaGodzinowa, int liczbaGodzin) {
		super(nazwisko, etat);
		this.stawkaGodzinowa = stawkaGodzinowa;
		this.liczbaGodzin = liczbaGodzin;
	}

	@Override
	public double getWyplata() {
		if (liczbaGodzin > limitGodzin) {
			int nadgodziny = liczbaGodzin - limitGodzin;
			return (stawkaGodzinowa * limitGodzin) + (stawkaGodzinowa * 1.5 * nadgodziny);
		}
		return stawkaGodzinowa * liczbaGodzin;
	}

}

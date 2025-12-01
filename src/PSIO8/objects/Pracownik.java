package PSIO8.objects;

public abstract class Pracownik {

	private String nazwisko;
	private double etat = 1.0;

	public Pracownik(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public Pracownik(String nazwisko, double etat) {
		this.nazwisko = nazwisko;
		this.etat = etat;
	}

	private void setEtat(double etat) {
		this.etat = etat;
	}

	public abstract double getWyplata();

	public String getNazwisko() {
		return nazwisko;
	}
	public double getEtat() {
		return etat;
	}
}

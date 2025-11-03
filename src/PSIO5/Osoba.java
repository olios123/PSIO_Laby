package PSIO5;

import java.util.Objects;

public class Osoba {
	private String imie;
	private String nazwisko;

	// Konstruktor
	public Osoba(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	// Get-ery
	public String getImie() {
		return imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}

	// Set-ery
	public void setImie(String imie) {
		this.imie = imie;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
}

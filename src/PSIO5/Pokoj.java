package PSIO5;

public class Pokoj {
	private int numerPokoju;
	private Osoba osoba; // Jeżeli osoba == null to pokój nie jest wynajęty

	// Konstruktor
	public Pokoj(int numerPokoju)
	{
		this.numerPokoju = numerPokoju;
		this.osoba = null;
	}
	public Pokoj(int numerPokoju, Osoba osoba) {
		this.numerPokoju = numerPokoju;
		this.osoba = osoba;
	}

	// Get-ery
	public int getNumerPokoju() {
		return numerPokoju;
	}
	public Osoba getOsoba() {
		return osoba;
	}

	// Set-ery
	public void setNumerPokoju(int numerPokoju) {
		this.numerPokoju = numerPokoju;
	}
	public void setOsoba(Osoba osoba) {
		this.osoba = osoba;
	}
}
package PSIO_Kolos.zad3;

public class Pokoj {
	private int number;
	private Osoba client = null;

	public Pokoj(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
	public Osoba getClient() {
		return client;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public void setClient(Osoba client) {
		this.client = client;
	}
	public void removeClient() {
		this.client = null;
	}
}

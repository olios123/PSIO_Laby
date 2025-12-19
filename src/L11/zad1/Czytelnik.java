package L11.zad1;

import java.util.ArrayList;

public class Czytelnik {

	private String imie;
	private String nazwisko;
	private String adres;
	private ArrayList<Ksiazka> lista_ksiazek;

	public Czytelnik(String imie, String nazwisko, String adres) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;
		lista_ksiazek = new ArrayList<>();
	}

	public String getImie() {
		return imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public String getAdres() {
		return getAdres();
	}
	public ArrayList<Ksiazka> getListaKsiazek() {
		return lista_ksiazek;
	}
}

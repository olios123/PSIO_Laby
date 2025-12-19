package L11.zad1;

public class Ksiazka {

	private String tytul;
	private String autor;
	private int rok_wyd;
	private Czytelnik czytelnik;

	public Ksiazka(String tytul, String autor, int rok_wyd) {
		this.tytul = tytul;
		this.autor = autor;
		this.rok_wyd = rok_wyd;
		this.czytelnik = null;
	}

	public String getTytul() {
		return tytul;
	}
	public String getAutor() {
		return autor;
	}
	public int getRok_wyd() {
		return rok_wyd;
	}
	public Czytelnik getCzytelnik() {
		return czytelnik;
	}
	public void setCzytelnik(Czytelnik czytelnik) {
		this.czytelnik = czytelnik;
	}
	public void removeCzytelnik() {
		this.czytelnik = null;
	}
}

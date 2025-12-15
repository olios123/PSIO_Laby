package PSIO9;

public class Pracownicy {
	private Pracownik pracownik;

	public Pracownicy() { this.pracownik = null; }

	public void setStrategy(Pracownik pracownik) {
		this.pracownik = pracownik;
	}

	public double getWyplata(double podstawa) {
		if (pracownik == null) {
			System.out.println("Brak pracownika do obliczenia wyplaty.");
		} else {
			return pracownik.obliczWyplate(podstawa);
		}
		return 0.0;
	}


}

package PSIO5;

public class Hotel {

	private Pokoj[] pokoje = new Pokoj[10];

	// Czy istnieje wolny pokój
	public boolean czyWolnyPokoj()
	{
		for (Pokoj pokoj : pokoje)
			if (pokoj.getOsoba() == null)
				return true; // Przynajmniej 1 wolny pokój

		return false; // Brak wolnych pokoi
	}

	// Wynajmij pokoj osobie o podanym numerze
	public void wynajmijPokoj(int numerPokoju, Osoba osoba)
	{
		for (Pokoj pokoj : pokoje)
		{
			if (pokoj.getNumerPokoju() == numerPokoju)
			{
				if (pokoj.getOsoba() != null)
					System.out.println("Ten pokój jest już wynajęty!");
			}
			else
			{
				pokoj.setOsoba(osoba);
				System.out.println("Wynajęto pokój nr " + numerPokoju);
			}

		}
	}

	// Zwolnij pokój
	public void zwolnijPokoj(int numerPokoju)
	{
		for (Pokoj pokoj : pokoje)
		{
			if (pokoj.getNumerPokoju() == numerPokoju)
			{
				pokoj.setOsoba(null);
				System.out.println("Zwolniono pokój nr " + numerPokoju);
			}
		}
	}

	// Ilość wolnych pokoi
	public int ileWolnychPokoi()
	{
		int wolnePokoje = 0;

		for (Pokoj pokoj : pokoje)
			if (pokoj.getOsoba() == null)
				wolnePokoje++;

		return wolnePokoje;
	}

	// Czy osoba o podanym nazwisku wynajmuje pokój
	public boolean czyOsobaWynajmujePokoj(String nazwisko)
	{
		boolean wynajmuje = false;

		for (Pokoj pokoj : pokoje)
			if (pokoj.getOsoba().getNazwisko().equals(nazwisko))
			{
				System.out.println("Osoba o nazwisku " + nazwisko + " wynajmuje pokój nr " + pokoj.getNumerPokoju());
				wynajmuje = true;
			}

		return wynajmuje;
	}

	// Zwolnij wszystkie pokoje wynajmowane przez osobę
	public void zwolnijWszystkiePokoje(Osoba osoba)
	{
		for (Pokoj pokoj : pokoje)
		{
			if (pokoj.getOsoba().equals(osoba))
			{
				pokoj.setOsoba(null);
				System.out.println("Zwolniono pokój nr " + pokoj.getNumerPokoju());
			}
		}
	}
}

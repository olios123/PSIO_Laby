package L5.Macierze;

import java.util.Arrays;

public class Main {
	public static void main(String[] args)
	{
		Macierz macierz1 = new Macierz(2, 3);

		macierz1.dodajWiersz(1, new int[]{1, 0, 2});
		macierz1.dodajWiersz(2, new int[]{-1, 3, 1});

		macierz1.wypiszMacierz();

		// ------------------------------------------

		Macierz macierz2 = new Macierz(3, 2);

		macierz2.dodajWiersz(1, new int[]{3, 1});
		macierz2.dodajWiersz(2, new int[]{2, 1});
		macierz2.dodajWiersz(3, new int[]{1, 0});

		macierz2.wypiszMacierz();

		// --------------------------------------------

		macierz1.wypiszMacierz(macierz1.mnozenieMacierzy(macierz1, macierz2));
	}
}

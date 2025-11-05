package L5.Macierze;

import java.util.Arrays;

public class Macierz {

	private int[][] macierz;
	private int n;
	private int m;

	public Macierz(int n, int m)
	{
		macierz = new int[n][m];
		this.n = n;
		this.m = m;
	}

	// Get-ery
	public int[][] getMacierz()
	{
		return this.macierz;
	}
	public int getRozmiarWiersze()
	{
		return n;
	}
	public int getRozmiarKolumny()
	{
		return m;
	}

	public int[] getWiersz(Macierz mac, int w)
	{
		int[] wiersz = new int[mac.getRozmiarKolumny()];

		for (int i = 0; i < mac.getRozmiarKolumny(); i++)
			wiersz[i] = mac.getMacierz()[w - 1][i];

		return wiersz;
	}
	public int[] getKolumne(Macierz mac, int k)
	{
		int[] kolumna = new int[mac.getRozmiarWiersze()];

		for (int i = 0; i < mac.getRozmiarWiersze(); i++)
			kolumna[i] = mac.getMacierz()[i][k - 1];

		return kolumna;
	}

	public void wypiszMacierz()
	{
		for (int i = 0; i < this.macierz.length; i++)
			System.out.println(Arrays.toString(macierz[i]));
	}
	public void wypiszMacierz(Macierz mac)
	{
		for (int i = 0; i < mac.getMacierz().length; i++)
			System.out.println(Arrays.toString(mac.getMacierz()[i]));
	}

	// Set-ery
	public void dodajWiersz(int n, int[] liczby)
	{
		for (int i = 0; i < this.macierz[n - 1].length; i++)
			this.macierz[n - 1][i] = liczby[i];
	}
	public void dodajWartosc(int n, int m, int liczba)
	{
		this.macierz[n - 1][m - 1] = liczba;
	}

	public Macierz mnozenieMacierzy(Macierz L, Macierz P)
	{
		if (L.getMacierz()[0].length != P.getMacierz().length)
		{
			System.out.println("Nie można pomnożyć takich macierzy!");
			return null;
		}

		int w = L.getMacierz()[0].length; // Wiersze pierwotnej L
		int k = P.getMacierz().length; // Kolumny pierwotnej P

		int n = L.getMacierz().length; // Wiersze końcowej
		int m = P.getMacierz()[0].length; // Kolumny końcowej

		Macierz mac = new Macierz(n, m);


		// Kolumny
		for (int j = 0; j < m; j++)
		{
			// Wiersze
			for (int i = 0; i < n; i++)
			{
				int wynik = 0;
				int[] wiersz = getWiersz(L, i + 1);
				int[] kolumna = getKolumne(P, j + 1);

				for (int x = 0; x < wiersz.length; x++)
				{
					wynik += wiersz[x] * kolumna[x];
				}
				mac.dodajWartosc(i + 1, j + 1, wynik);
			}
		}

		return mac;
	}

}

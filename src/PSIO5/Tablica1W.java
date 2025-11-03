package PSIO5;

import java.util.Arrays;
import java.util.Random;

public class Tablica1W {

	private int[] tab;

	public Tablica1W(int rozmiarTablicy)
	{
		this.tab = new int[rozmiarTablicy];
	}
	public Tablica1W(int rozmiarTablicy, int doIlu)
	{
		this.tab = new int[rozmiarTablicy];
		wypelnij(doIlu);
	}

	public void wypelnij(int doIlu)
	{
		Random random = new Random();
		for (int i = 0; i < tab.length; i++)
		{
			tab[i] = random.nextInt(doIlu); // 0 - (doIlu - 1)
		}
	}

	// index / -1 -> nie znalazło
	public int szukaj(int wartosc)
	{
		for (int i = 0; i < tab.length; i++)
		{
			if (tab[i] == wartosc)
				return i; // Zwróć index znalezionego elementu
		}
		return -1;// Nie znaleziono wartości
	}
	public int szukaj2(int wartosc)
	{
		int ret = -1;
		for (int i = 0; i < tab.length && ret == -1; i++)
		{
			if (tab[i] == wartosc)
			{
				ret = i;
			}
		}
		return ret;

	}

	public void usun(int wartosc)
	{
		int index = szukaj(wartosc);
		if (index == -1)
		{
			System.out.println("Nie znaleziono wartości");
			return;
		}

		int[] temp = new int[tab.length - 1];
		for (int i = 0; i < index; i++)
		{
			temp[i] = tab[i];
		}
		for (int i = index + 1; i < tab.length; i++)
		{
			temp[i - 1] = tab[i];
		}
		tab = temp;
	}
	public void usun2(int wartosc, int ile)
	{
		int index = szukaj(wartosc);
		if (index == -1)
		{
			System.out.println("Nie znaleziono wartości");
			return;
		}

		for (int i = index; i < ile; i++)
		{
			this.tab[i] = this.tab[i + 1];
		}
		ile -= 1;
	}
	public void usun3(int wartosc, int ile)
	{
		int index = szukaj(wartosc);
		if (index == -1)
		{
			System.out.println("Nie znaleziono wartości");
			return;
		}

		this.tab[index] = this.tab[ile - 1];
		ile -= 1;
	}

	public void wypisz()
	{
		for (int i = 0; i < tab.length; i++)
		{
			System.out.println(tab[i]);
		}
	}

	public int[] getTablica() { return tab; }

}

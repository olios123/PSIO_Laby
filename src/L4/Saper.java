package L4;

import java.util.Random;

public class Saper {
	public static void main(String[] args)
	{
		// Wiersze
		int n = 10;
		// Kolumny
		int m = 10;

		// Szasna za pojawienie się bomby w procentach
		int c = 10;

		Random random = new Random();

		String[][] saper = new String[n][m];

		// Generowanie planszy sapera
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				if (random.nextInt(100) <= c) saper[i][j] = "*";
				else saper[i][j] = ".";
			}
		}

		plansza(saper);
		System.out.println();

		// Sprawdzanie bomb
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				String punkt = saper[i][j];
				int bomby = 0;

				// Punkt jest bombą
				if (punkt == "*") continue;

				if (i > 0) // Góra
					if (saper[i - 1][j] == "*") bomby++;

				if (i > 0 && j > 0) // Góra lewy
					if (saper[i - 1][j - 1] == "*") bomby++;

				if (j > 0) // Lewy
					if (saper[i][j - 1] == "*") bomby++;

				if (i < n - 1 && j > 0) // Dół lewy
					if (saper[i + 1][j - 1] == "*") bomby++;

				if (i < n - 1) // Dół
					if (saper[i + 1][j] == "*") bomby++;

				if (i < n - 1 && j < m - 1) // Prawy dolny
					if (saper[i + 1][j + 1] == "*") bomby++;

				if (j < m - 1) // Prawy
					if (saper[i][j + 1] == "*") bomby++;

				if (i > 0 && j < m - 1) // Góra prawy
					if (saper[i - 1][j + 1] == "*") bomby++;

				if (bomby != 0)
					saper[i][j] = String.valueOf(bomby);
			}
		}

		plansza(saper);
	}

	/**
	 * Wypisywanie każdego elementu tablicy do konsoli
	 * @param list
	 */
	public static void plansza(String[][] list)
	{
		for (int i = 0; i < list.length; i++)
		{
			for (int j = 0; j < list[i].length; j++)
			{
				System.out.print(list[i][j] + "  ");
			}
			System.out.println("");
		}
	}
}

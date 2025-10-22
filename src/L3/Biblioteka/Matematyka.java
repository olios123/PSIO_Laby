package L3.Biblioteka;

public class Matematyka {

	/**
	 * Obliczanie sin(x) na podstawie szeregu Taylora
	 * @param x - radiany
	 * @param n - przyjeta dokładność obliczeń
	 * @return
	 */
	public static double sin(double x, int n)
	{
		// Suma wyrażenia
		double sum = x;

		double top = x; // Licznik dzielenia (potęgi)
		double bottom = 1; // Mianownik dzielenia (silnie)
		int znak = -1; // Znak +/-

		// Obliczanie sin(x) na podstawie dokładności n
		for (int i = 1; i <= n; i++)
		{
			top = top * x * x; // Potęga
			bottom = bottom * (2 * i) * (2 * i + 1);

			// Suma
			sum += znak * (top / bottom);

			// Zmiana znaku na przeciwny
			znak *= -1;
		}

		return sum;
	}

	/**
	 * Obliczanie cos(x) na podstawie szeregu Taylora
	 * @param x - radiany
	 * @param n - przyjeta dokładność obliczeń
	 * @return
	 */
	public static double cos(double x, int n)
	{
		// Suma wyrażenia
		double sum = 1;

		double top = 1; // Licznik dzielenia (potęgi)
		double bottom = 1; // Mianownik dzielenia (silnie)
		int znak = -1; // Znak +/-

		// Obliczanie cos(x) na podstawie dokładności n
		for (int i = 1; i <= n; i++)
		{
			top = top * x * x; // Potęga
			bottom = bottom * (2 * i - 1) * (2 * i);

			// Suma
			sum += znak * (top / bottom);

			// Zmiana znaku na przeciwny
			znak *= -1;
		}

		return sum;
	}

	/**
	 * Obliczanie funkcji e^x
	 * @param x - potęga
	 * @param n - dokładność
	 * @return wynik obliczenia e^x
	 */
	public static double ex(double x, int n)
	{
		// Suma kolejnych elementów
		double sum = 1;

		double top = 1; // Licznik dzielenia (potęgi)
		double bottom = 1; // Mianownik dzielenia (silnie)

		// Obliczanie e^x na podstawie dokładności n
		for (int i = 1; i <= n; i++)
		{
			top *= x; // Potęgi
			bottom *= i; // Silnia
			sum += top / bottom; // Suma dzieleń
		}

		// Zwracanie wartości liczenia e^x
		return sum;
	}
}

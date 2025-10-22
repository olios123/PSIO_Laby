package L3.Biblioteka;

public class Matematyka {

	/**
	 * Obliczanie sin(x) na podstawie szeregu Taylora
	 * @param x
	 * @param n
	 * @return
	 */
	public static double sin(double x, int n)
	{
		double sum = x;

		double top = x * x * x;
		double bottom = 6; // 3!

		for (int i = 1; i <= n; i++)
		{
			top *= x * x;
			bottom *= i * i;

			System.out.println(i);
			
			if (i % 2 == 0) sum += top / bottom;
			else sum -= top / bottom;
		}

		return sum;
	}

	public static double cos(double x)
	{
		return Double.NaN;
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

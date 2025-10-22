package ex;

import java.util.Scanner;

public class Main {
	/**
	 * Wczytywanie danych z klawiatury
	 * @param message - wiadomość do wyświetlenia
	 * @return zwracamy int dla tego programu
	 */
	public static int read(String message)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print(message);
		int output = scanner.nextInt();

		return output;
	}

	/**
	 * Liczenie e^x
	 * @param x - potęga
	 * @param k - dokładność
	 * @return wynik obliczenia e^x
	 */
	public static double ex(int x, int k)
	{
		// Suma kolejnych elementów
		double sum = 1;

		double top = 1; // Licznik dzielenia (potęgi)
		double bottom = 1; // Mianownik dzielenia (silnie)

		// Obliczanie e^x na podstawie dokładności k
		for (int i = 1; i <= k; i++)
		{
			top *= x; // Potęgi
			bottom *= i; // Silnia
			sum += top / bottom; // Suma dzieleń
		}

		// Zwracanie wartości liczenia e^x
		return sum;
	}

	public static void main(String[] args)
	{
		System.out.println("Obliczanie wartości e^x");

		// Wczytywanie wartości X
		int x = read("Podaj x: ");

		// Wczytywanie dokładności k
		int k = read("Podaj dokładność obliczeń: ");

		// Wynik funkcji obliczającej e^x
		double e = ex(x, k);

		System.out.println("------------------------------------");
		System.out.print("e^x, dla x = ");
		System.out.print(x);
		System.out.print(" wynosi: ");
		System.out.print(e);
	}
}

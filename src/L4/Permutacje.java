package L4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Permutacje {

	// Tablica na której będziemy przetwarzać permutacje
	public static String[] array = new String[]{"1", "2", "3"};
	// Tablica dwówymiarowa która będzie służyła jako rezultat
	public static String[][] result = new String[factorial(array.length)][array.length];
	// Pozycja do tablicy rezultatu
	public static int pos = 0;

	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args)
	{
		permutations(array, 0);
		for (String[] tab : result)
		{
			System.out.println(Arrays.toString(tab));
		}
	}

	/**
	 * Funckja tworząca pełną tablicę permutacji swoich elementów
	 * Funkcja rekurencyjna
	 * @param list - tablica na której zostaną wykonane permutacje
	 * @param index - index pierwszego elementu zmiany
	 */
	public static void permutations(String[] list, int index)
	{
		// Przypadek podstawowy
		if (index == list.length - 1)
		{
			// Zapis tablicy do rezultatu
			result[pos++] = list;
			return;
		}
		// Kopia tablicy
		String[] arr = Arrays.copyOf(list, list.length);

		// Pętla od indexu do końca tablicy
		for (int i = index; i < arr.length; i++)
		{
			// Tablica po zamienie miejsc elementów
			String[] swapped = changeIndex(arr, index, i);
			// Wywołanie rekurencyjne funkcji dla kolejnego indexu
			permutations(swapped, index + 1);
		}
	}

	/**
	 * Funkcja zamieniająca miejscami wartości o podanych indexach w tablicy
	 * @param list - tablica na której zostaną zamienione elementy
	 * @param index1
	 * @param index2
	 * @return zwraca tablicę po zamianie elementów miejscami
	 */
	public static String[] changeIndex(
			String[] list,
			int index1,
			int index2
	)
	{
		String[] arr = Arrays.copyOf(list, list.length);

		String v = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = v;

		return arr;
	}

	/**
	 * Funkcja do obliczania silni
	 * @param x - liczba która ma być silnią
	 * @return zwraca silnię danej liczby
	 */
	public static int factorial(int x)
	{
		int result = 1;
		for (int i = 1; i <= x; i++)
		{
			result *= i;
		}
		return result;
	}
}

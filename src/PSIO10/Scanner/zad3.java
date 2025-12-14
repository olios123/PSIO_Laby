package PSIO10.Scanner;

import java.util.Scanner;

public class zad3 {
	public static void main(String[] args) {
		double[] sum = new double[255];
		int[] count = new int[255];

		Scanner scanner = new Scanner(System.in);
		System.out.println("Podawaj liczby (wpisz 'STOP', aby zakończyć):");

		int line = 0;
		while (true) {
			String input = scanner.nextLine();
			if (input.equals("STOP")) {
				break;
			}

			for (String str : input.split(" ")) {
				try {
					double number = Double.parseDouble(str);
					sum[line] += number;
					count[line] += 1;
				} catch (NumberFormatException e) {
					System.out.println("Nieprawidłowa liczba, spróbuj ponownie.");
				}
			}
			line++;
		}

		for (int i = 0; i < line; i++) {
			System.out.println("Suma dla linii " + (i + 1) + ": " + sum[i] + " | Ilość liczb: " + count[i]);
		}
	}
}

package PSIO10.Scanner;

import java.util.Scanner;

public class zad4 {
	public static void main(String[] args) {
		double[] sum = new double[255];
		int[] count = new int[255];

		Scanner scanner = new Scanner(System.in);

		System.out.println("Podawaj tekst oraz liczby (wpisz 'STOP', aby zakończyć):");
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
				}
				catch (NumberFormatException e) {
					// Tekst
					count[line] += 1;
				}
			}
			line++;
		}

		for (int i = 0; i < line; i++) {
			System.out.println("Linia " + (i + 1) + ": Suma liczb = " + sum[i] + " | Ilość wyrazów = " + count[i]);
		}
	}
}

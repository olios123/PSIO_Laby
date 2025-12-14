package PSIO10.Buffer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class zad4 {
	public static void main(String[] args) {
		double[] sum = new double[255];
		int[] count = new int[255];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Podawaj tekst oraz liczby (wpisz 'STOP', aby zakończyć):");

		try {
			int line = 0;
			String input;
			while (true) {
				input = br.readLine();
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
						if (str.trim().length() > 0)
							count[line] += 1;
					}
				}
				line++;
			}

			for (int i = 0; i < line; i++) {
				System.out.println("Linia " + (i + 1) + ": Suma liczb = " + sum[i] + " | Ilość wyrazów = " + count[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

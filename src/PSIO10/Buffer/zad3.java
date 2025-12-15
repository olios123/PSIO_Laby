package PSIO10.Buffer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class zad3 {
	public static void main(String[] args) {
		double[] sum = new double[255];
		int[] count = new int[255];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Podawaj liczby (wpisz 'STOP', aby zakończyć):");

		try {
			int l = 0;
			String line;
			while (true) {
				line = br.readLine();
				if (line.equals("STOP")) {
					break;
				}

				for (String str : line.split(" ")) {
					try {
						double number = Double.parseDouble(str);
						sum[l] += number;
						count[l] += 1;
					} catch (NumberFormatException e) {}
				}
				l++;
			}
			br.close();
			for (int i = 0; i < l; i++) {
				System.out.println("Suma dla linii " + (i + 1) + ": " + sum[i] + " | Ilość liczb: " + count[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

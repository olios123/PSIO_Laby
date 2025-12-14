package PSIO10.Buffer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class zad2 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Podawaj liczby aby obliczyć ich sumę (wpisz 'STOP', aby zakończyć):");

		try {
			String line;
			double sum = 0;
			while (true) {
				line = br.readLine();
				if (line.equals("STOP")) {
					break;
				}
				try {
					double number = Double.parseDouble(line);
					sum += number;
				} catch (NumberFormatException e) {
					System.out.println("Nieprawidłowa liczba, spróbuj ponownie.");
				}
			}
			System.out.println("Suma wprowadzonych liczb: " + sum);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}

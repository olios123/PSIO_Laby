package PSIO10.Scanner;

import java.util.Scanner;

public class zad2 {
	public static void main(String[] args) {
		double sum = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Podawaj liczby aby obliczyć ich sumę (wpisz 'STOP', aby zakończyć):");
		while (true) {
			String input = scanner.nextLine();
			if (input.equals("STOP")) {
				break;
			}
			try {
				double number = Double.parseDouble(input);
				sum += number;
			} catch (NumberFormatException e) {
				System.out.println("Nieprawidłowa liczba, spróbuj ponownie.");
			}
		}
		System.out.println("Suma wprowadzonych liczb: " + sum);

	}
}

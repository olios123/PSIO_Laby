package L9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj wiek: ");
		int age = scanner.nextInt();

		try {
			checkAge(age);
		} catch (InvalidAgeException e) {
			System.out.println("Nieprawidłowy wiek: " + e.getMessage());
		}
	}

	private static void checkAge(int age) throws InvalidAgeException {
		if (age < 18) throw new InvalidAgeException("Wiek musi byc co najmniej 18 lat");
		else System.out.println("Dostęp przyznany");
	}
}

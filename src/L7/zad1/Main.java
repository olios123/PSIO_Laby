package L7.zad1;

import L7.zad1.Strategies.*;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TextEditor editor = new TextEditor();

		System.out.println("--- Edytor Tekstu ze Strategiami ---");
		System.out.print("Podaj tekst do sformatowania: ");
		String text = scanner.nextLine();

		System.out.println("\nWybierz strategię:");
		System.out.println("1. UpperCase (WIELKIE LITERY)");
		System.out.println("2. LowerCase (małe litery)");
		System.out.println("3. TitleCase (Tytułowy)");
		System.out.println("4. Custom (Własny wzorzec)");
		System.out.print("Twój wybór: ");

		String choice = scanner.nextLine();

		switch (choice) {
			case "1":
				editor.setFormatter(new UpperCaseFormatter());
				editor.printFormatted(text);
				break;
			case "2":
				editor.setFormatter(new LowerCaseFormatter());
				editor.printFormatted(text);
				break;
			case "3":
				editor.setFormatter(new TitleCaseFormatter());
				editor.printFormatted(text);
				break;
			case "4":
				System.out.print("Podaj wzorzec formatowania (użyj %s w miejscu tekstu, np. '*** %s ***'): ");
				String pattern = scanner.nextLine();
				editor.setFormatter(new CustomFormatter(pattern));
				editor.printFormatted(text);
				break;
			default:
				System.out.println("Nieznana opcja.");
		}

		scanner.close();
	}
}
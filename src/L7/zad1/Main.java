package L7.zad1;

import L7.zad1.Strategies.*;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TextEditor editor = new TextEditor();

		System.out.println("Text editor with strategy pattern");
		System.out.print("Enter text to format: ");
		String text = scanner.nextLine();

		System.out.println("Chose strategy:");
		System.out.println("1. UpperCase");
		System.out.println("2. LowerCase");
		System.out.println("3. TitleCase");
		System.out.println("4. Custom");
		System.out.print("Your choice: ");

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
				System.out.print("Enter custom format: ");
				String pattern = scanner.nextLine();
				editor.setFormatter(new CustomFormatter(pattern));
				editor.printFormatted(text);
				break;
			default:
				System.out.println("Incorrect option.");
		}

		scanner.close();
	}
}
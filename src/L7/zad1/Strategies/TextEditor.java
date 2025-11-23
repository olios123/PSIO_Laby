package L7.zad1.Strategies;

import L7.zad1.TextFormatter;

public class TextEditor {
	private TextFormatter formatter;

	// Konstruktor domyślny (można ustawić domyślny formatter)
	public TextEditor() {
		// Domyślnie brak zmian
		this.formatter = input -> input;
	}

	public void setFormatter(TextFormatter formatter) {
		this.formatter = formatter;
		System.out.println("-> Zmieniono strategię formatowania na: " + formatter.getClass().getSimpleName());
	}

	public void printFormatted(String text) {
		if (formatter == null) {
			System.out.println(text);
		} else {
			System.out.println("Wynik: " + formatter.format(text));
		}
	}
}
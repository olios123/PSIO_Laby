package L7.zad1;

public class TextEditor {
	private TextFormatter formatter;

	public TextEditor() {
		this.formatter = null;
	}

	public void setFormatter(TextFormatter formatter) {
		this.formatter = formatter;
	}

	public void printFormatted(String text) {
		if (formatter == null) {
			System.out.println(text);
		} else {
			System.out.println("Result: " + formatter.format(text));
		}
	}
}
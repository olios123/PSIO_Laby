package L7.zad1.Strategies;

import L7.zad1.TextFormatter;

public class CustomFormatter implements TextFormatter {
	private String pattern;

	public CustomFormatter(String pattern) {
		this.pattern = pattern;
	}

	@Override
	public String format(String input) {
		return String.format(pattern, input);
	}
}

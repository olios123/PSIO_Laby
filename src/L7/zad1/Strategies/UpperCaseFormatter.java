package L7.zad1.Strategies;

import L7.zad1.TextFormatter;

public class UpperCaseFormatter implements TextFormatter {
	@Override
	public String format(String input) {
		if (input == null) return null;
		return input.toUpperCase();
	}
}
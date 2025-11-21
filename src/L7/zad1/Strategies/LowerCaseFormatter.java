package L7.zad1.Strategies;

import L7.zad1.TextFormatter;

public class LowerCaseFormatter implements TextFormatter {
	@Override
	public String format(String input) {
		if (input == null) return null;
		return input.toLowerCase();
	}
}
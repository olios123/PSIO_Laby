package L7.zad1.Strategies;

import L7.zad1.TextFormatter;

public class TitleCaseFormatter implements TextFormatter {
	@Override
	public String format(String input) {
		if (input == null || input.isEmpty()) return input;
		String str = "";

		String[] words = input.split(" ");

		for (String word : words) {
			String[] splitWord = word.split("");
			str += splitWord[0].toUpperCase();
			for (int i = 1; i < splitWord.length; i++) {
				str += splitWord[i].toLowerCase();
			}
			str += " ";
		}
		return str;
	}
}
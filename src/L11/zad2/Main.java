package L11.zad2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj napis do analizy: ");
		String str = scanner.nextLine();

		Map<String, Integer> chars = new HashMap<>();

		for (String s : str.replaceAll("\\s+","")
				.split("")) {
			if (chars.containsKey(s))
				chars.put(s, chars.get(s) + 1);
			else chars.put(s, 1);
		}

		int max = 0;
		String maxChar = "";

		for (Map.Entry<String, Integer> entry : chars.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				maxChar = entry.getKey();
			}
			System.out.println("Znak '" + entry.getKey() + "' występuje " + entry.getValue() + " razy.");
		}

		System.out.println("Najczęściej występujący znak to '" + maxChar + "' który występuje " + max + " razy.");
	}
}

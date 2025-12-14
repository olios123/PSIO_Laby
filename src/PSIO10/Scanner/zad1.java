package PSIO10.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zad1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Podawaj linie tekstu (wpisz 'STOP', aby zakończyć):");
		while (true) {
			String line = scanner.nextLine();
			if (line.equals("STOP")) {
				break;
			}
			list.add(line);
		}

		System.out.println("Wprowadzone linie tekstu:");
		for (String str : list) {
			System.out.println(str);
		}

	}


}

package PSIO10.Buffer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class zad1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Podawaj linie tekstu (wpisz 'STOP', aby zakończyć):");
		try {
			String line;
			while (true) {
				line = br.readLine();
				if (line.equals("STOP")) {
					break;
				}
				list.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Wprowadzone linie tekstu:");
		for (String str : list) {
			System.out.println(str);
		}
	}
}

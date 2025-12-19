package L11.zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		Ksiazka ksiazka1 = new Ksiazka("tytuł", "Kacper", 2000);
		Ksiazka ksiazka2 = new Ksiazka("niesamowita książka", "Adam", 1929);
		Ksiazka ksiazka3 = new Ksiazka("super książka", "Zosia", 820);
		Ksiazka ksiazka4 = new Ksiazka("też książka", "Piotrek", 2015);

		ArrayList<Ksiazka> ksiazki = new ArrayList<>();
		ksiazki.add(ksiazka1);
		ksiazki.add(ksiazka2);
		ksiazki.add(ksiazka3);
		ksiazki.add(ksiazka4);

		ksiazki.sort(new KsiazkaRokComparator());
		for (Ksiazka ksiazka : ksiazki) {
			System.out.println(ksiazka.getTytul() + " " + ksiazka.getAutor() + " " + ksiazka.getRok_wyd());
		}

		System.out.println("---------------------------------");

		ksiazki.sort(new KsiazkaAutorComparator());
		for (Ksiazka ksiazka : ksiazki) {
			System.out.println(ksiazka.getTytul() + " " + ksiazka.getAutor() + " " + ksiazka.getRok_wyd());
		}
	}
}

class KsiazkaRokComparator implements Comparator<Ksiazka> {
	@Override
	public int compare(Ksiazka o1, Ksiazka o2) {
		if (o1.getRok_wyd() == o2.getRok_wyd())
			return 0;
		else if (o1.getRok_wyd() > o2.getRok_wyd())
			return 1;
		else
			return -1;
	}
}

class KsiazkaAutorComparator implements Comparator<Ksiazka> {
	@Override
	public int compare(Ksiazka o1, Ksiazka o2)
	{
		return o1.getAutor().compareTo(o2.getAutor());
	}
}

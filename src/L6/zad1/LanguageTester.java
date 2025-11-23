package L6.zad1;

import java.util.*;

public class LanguageTester {
	private List<ProgrammingLanguage> list;

	public LanguageTester() {
		list = new ArrayList<>();
	}

	public void addLanguage(ProgrammingLanguage pl) {
		list.add(pl);
	}

	public void print() {
		for (ProgrammingLanguage e : list) {
			System.out.println(e.toString());
		}
	}

	public void sort() {
		Collections.sort(list, Comparator.comparing(ProgrammingLanguage::getName));
	}


}

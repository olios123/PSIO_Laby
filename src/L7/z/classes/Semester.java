package L7.z.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Semester {
	private int semesterNr;
	// Mapa przechowuje: Nazwa przedmiotu -> Lista ocen
	private Map<String, List<Double>> subjectsAndGrades;

	public Semester(int semesterNr, List<String> subjects) {
		if (semesterNr < 1 || semesterNr > 7) {
			throw new IllegalArgumentException("Nr semestru musi być z zakresu 1-7");
		}
		this.semesterNr = semesterNr;
		this.subjectsAndGrades = new HashMap<>();

		// Inicjalizacja przedmiotów z pustymi listami ocen
		for (String subject : subjects) {
			this.subjectsAndGrades.put(subject, new ArrayList<>());
		}
	}

	// C) Funkcjonalność przechowywania/modyfikacji ocen
	public void addGrade(String subject, double grade) {
		if (subjectsAndGrades.containsKey(subject)) {
			subjectsAndGrades.get(subject).add(grade);
		} else {
			System.out.println("Błąd: Przedmiot " + subject + " nie istnieje w tym semestrze.");
		}
	}

	public int getSemesterNr() {
		return semesterNr;
	}

	public Map<String, List<Double>> getSubjectsAndGrades() {
		return subjectsAndGrades;
	}
}
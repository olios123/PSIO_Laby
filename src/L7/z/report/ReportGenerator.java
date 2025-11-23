package L7.z.report;

import L7.z.classes.Semester;
import L7.z.classes.Student;

import java.util.List;

public abstract class ReportGenerator {

	// Metoda Szablonowa - definiuje kroki, których nie można zmieniać (final)
	public final String generateReport(List<Student> students, int semesterNr) {
		StringBuilder report = new StringBuilder();

		// Krok b: Nagłówek
		report.append(formatHeader(semesterNr));

		// Krok a & c: Pobieranie danych i formatowanie treści
		for (Student student : students) {
			Semester semester = student.getSemester(semesterNr);
			if (semester != null) {
				report.append(formatBody(student, semester));
			}
		}

		// Krok d: Stopka
		report.append(formatFooter());

		// Krok e: Zwracanie wyniku
		return report.toString();
	}

	// Metody abstrakcyjne do zaimplementowania w konkretnych klasach
	protected abstract String formatHeader(int semesterNr);
	protected abstract String formatBody(Student student, Semester semester);
	protected abstract String formatFooter();
}
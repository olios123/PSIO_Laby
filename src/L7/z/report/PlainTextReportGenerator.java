package L7.z.report;

import L7.z.classes.Semester;
import L7.z.classes.Student;

import java.util.List;
import java.util.Map;

public class PlainTextReportGenerator extends ReportGenerator {

	@Override
	protected String formatHeader(int semesterNr) {
		return "========================================\n" +
				" RAPORT OCEN - SEMESTR " + semesterNr + "\n" +
				"========================================\n\n";
	}

	@Override
	protected String formatBody(Student s, Semester sem) {
		StringBuilder sb = new StringBuilder();
		sb.append("STUDENT: ").append(s.getName()).append(" ").append(s.getSurname())
				.append(" (Nr albumu: ").append(s.getId()).append(")\n");
		sb.append("Uczelnia: ").append(s.getUniversity()).append(", Kierunek: ").append(s.getField()).append("\n");
		sb.append("PRZEDMIOTY:\n");

		for (Map.Entry<String, List<Double>> entry : sem.getSubjectsAndGrades().entrySet()) {
			sb.append(" - ").append(String.format("%-5s", entry.getKey()))
					.append(": ").append(entry.getValue()).append("\n");
		}
		sb.append("----------------------------------------\n");
		return sb.toString();
	}

	@Override
	protected String formatFooter() {
		return "\nKONIEC RAPORTU\nWygenerowano automatycznie.\n";
	}
}

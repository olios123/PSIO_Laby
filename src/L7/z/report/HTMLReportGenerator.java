package L7.z.report;

import L7.z.classes.Semester;
import L7.z.classes.Student;

import java.util.List;
import java.util.Map;

public class HTMLReportGenerator extends ReportGenerator {

	@Override
	protected String formatHeader(int semesterNr) {
		return "<html>\n<head><style>table, th, td {border: 1px solid black; border-collapse: collapse; padding: 5px;}</style></head>\n<body>\n" +
				"<h1>Raport Ocen - Semestr " + semesterNr + "</h1>\n";
	}

	@Override
	protected String formatBody(Student s, Semester sem) {
		StringBuilder sb = new StringBuilder();
		sb.append("<div style='margin-bottom: 20px; border: 1px solid #ccc; padding: 10px;'>\n");
		sb.append("  <h3>").append(s.getName()).append(" ").append(s.getSurname())
				.append(" <small>(").append(s.getId()).append(")</small></h3>\n");
		sb.append("  <p><strong>Uczelnia:</strong> ").append(s.getUniversity())
				.append(" | <strong>Kierunek:</strong> ").append(s.getField()).append("</p>\n");

		sb.append("  <table>\n    <tr><th>Przedmiot</th><th>Oceny</th></tr>\n");
		for (Map.Entry<String, List<Double>> entry : sem.getSubjectsAndGrades().entrySet()) {
			sb.append("    <tr><td>").append(entry.getKey()).append("</td><td>")
					.append(entry.getValue()).append("</td></tr>\n");
		}
		sb.append("  </table>\n");
		sb.append("</div>\n");
		return sb.toString();
	}

	@Override
	protected String formatFooter() {
		return "<hr>\n<p><i>Wygenerowano przez system raportowania.</i></p>\n</body>\n</html>";
	}
}

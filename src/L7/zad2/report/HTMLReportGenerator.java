package L7.zad2.report;

import L7.zad2.classes.Semester;
import L7.zad2.classes.Student;
import L7.zad2.classes.Subject;

public class HTMLReportGenerator extends ReportGenerator {

	@Override
	protected String formatHeader(int semesterNr) {
		return "<!DOCTYPE html>\n<html>\n<head></head>\n<body>\n" +
				"<h1>STUDENT GRADE REPORT - SEMESTER " + semesterNr + "</h1>\n";
	}

	@Override
	protected String formatBody(Student s, Semester sem) {
		String sb = "";
		sb += "<h3>" + "STUDENT: " + s.getName() + " " + s.getSurname()
				+ " (Album ID: " + s.getId() + ")" + "</h3>\n";
		sb += "<p><strong>University:</strong> " + s.getUniversity() + " | <strong>Field:</strong> " + s.getField() + "</p>\n";
		sb += "<table>\n    <tr><th>Subject</th><th>Grades</th></tr>\n";

		Semester semester = s.getSemester(sem.getSemesterNr());
		for (Subject subject : semester.getSubjects()) {
			sb += "    <tr><td>" + subject.getName() + "</td><td>"
					+ subject.getGrade() + "</td></tr>\n";
		}

		sb += "  </table>\n";

		return sb.toString();
	}

	@Override
	protected String formatFooter() {
		return "<hr>\n<footer>End of HTML report</footer>\n</body>\n</html>";
	}
}

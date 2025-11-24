package L7.zad2.report;

import L7.zad2.classes.Semester;
import L7.zad2.classes.Student;

import java.util.List;

public abstract class ReportGenerator {

	public final String generateReport(List<Student> students, int semesterNr) {
		StringBuilder report = new StringBuilder();

		// Header
		report.append(formatHeader(semesterNr));

		// Load data for each student
		for (Student student : students) {
			Semester semester = student.getSemester(semesterNr);
			if (semester != null) {
				report.append(formatBody(student, semester));
			}
		}

		// Footer
		report.append(formatFooter());

		// Return the final report
		return report.toString();
	}

	protected abstract String formatHeader(int semesterNr);
	protected abstract String formatBody(Student student, Semester semester);
	protected abstract String formatFooter();
}
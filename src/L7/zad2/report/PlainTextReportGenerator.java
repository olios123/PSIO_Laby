package L7.zad2.report;

import L7.zad2.classes.Semester;
import L7.zad2.classes.Student;
import L7.zad2.classes.Subject;

public class PlainTextReportGenerator extends ReportGenerator {

	@Override
	protected String formatHeader(int semesterNr) {
		return "-------------------------------\n" +
				" STUDENT GRADE REPORT - SEMESTER " + semesterNr + "\n" +
				"-------------------------------\n";
	}

	@Override
	protected String formatBody(Student s, Semester sem) {
		String sb = "";

		sb += "STUDENT: " + s.getName() + " " + s.getSurname()
				+ " (Album ID: " + s.getId() + ")\n";
		sb += "University: " + s.getUniversity() + ", Field: " + s.getField() + "\n";
		sb += "SUBJECTS:\n";

		Semester semester = s.getSemester(sem.getSemesterNr());
		for (Subject subject : semester.getSubjects()) {
			sb += " - " + String.format("%-5s", subject.getName())
					+ ": " + subject.getGrade() + "\n";
		}
		return sb;
	}

	@Override
	protected String formatFooter() {
		return "-------------------------------\n" +
				" END OF REPORT\n" +
				"-------------------------------\n";
	}
}

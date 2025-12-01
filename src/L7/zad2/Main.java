package L7.zad2;

import L7.zad2.classes.Semester;
import L7.zad2.classes.Student;
import L7.zad2.classes.Subject;
import L7.zad2.report.HTMLReportGenerator;
import L7.zad2.report.PlainTextReportGenerator;
import L7.zad2.report.ReportGenerator;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		// Student 1
		Student student1 = new Student("Jan", "Kowalski", "Politechnika", "Informatyka", "123456");
		List<String> subjectsNames1 = List.of("P1", "P2", "P3");
		List<Subject> subjects1 = new ArrayList<>();
		for (String name : subjectsNames1) {
			subjects1.add(new Subject(name));
		}
		Semester semester1 = new Semester(1, subjects1);
		semester1.addGrade("P1", 3.5);
		semester1.addGrade("P2", 4.0);
		semester1.addGrade("P2", 3.0);
		semester1.addGrade("P3", 5.0);
		semester1.addGrade("P3", 5.0);
		student1.addSemester(semester1);

		// Student 2
		Student student2 = new Student("Anna", "Nowak", "Politechnika", "Informatyka", "654321");
		List<String> subjectsNames2 = List.of("P1", "P2", "P3", "P4", "P5");
		List<Subject> subjects2 = new ArrayList<>();
		for (String name : subjectsNames2) {
			subjects2.add(new Subject(name));
		}
		Semester semester2 = new Semester(1, subjects2);
		semester2.addGrade("P1", 5.0);
		semester2.addGrade("P1", 5.0);
		semester2.addGrade("P2", 4.5);
		semester2.addGrade("P3", 4.0);
		semester2.addGrade("P3", 4.0);
		semester2.addGrade("P4", 5.0);
		student2.addSemester(semester2);
		Semester semester3 = new Semester(2, subjects2);
		semester3.addGrade("P1", 3.0);
		semester3.addGrade("P1", 2.0);
		semester3.addGrade("P3", 4.0);
		semester3.addGrade("P4", 3.5);
		student2.addSemester(semester3);


		List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);

		// Reports
		// Text
		ReportGenerator textReportGenerator = new PlainTextReportGenerator();
		String textReport = textReportGenerator.generateReport(studentList, 1);
		System.out.println(textReport);

		// HTML
		ReportGenerator htmlReportGenerator = new HTMLReportGenerator();
		String htmlReport = htmlReportGenerator.generateReport(studentList, 1);
		System.out.println(htmlReport);
	}
}

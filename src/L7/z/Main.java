package L7.z;

import L7.z.classes.Semester;
import L7.z.classes.Student;
import L7.z.report.HTMLReportGenerator;
import L7.z.report.PlainTextReportGenerator;
import L7.z.report.ReportGenerator;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// 1. Przygotowanie danych
		// Student 1
		Student s1 = new Student("Jan", "Kowalski", "Politechnika", "Informatyka", "123456");
		List<String> subjectsS1 = List.of("P1 (Matematyka)", "P2 (Fizyka)", "P3 (Programowanie)");
		Semester sem1_s1 = new Semester(1, subjectsS1);

		// Dodawanie ocen
		sem1_s1.addGrade("P1 (Matematyka)", 3.5); sem1_s1.addGrade("P1 (Matematyka)", 4.0);
		sem1_s1.addGrade("P2 (Fizyka)", 3.0); sem1_s1.addGrade("P2 (Fizyka)", 3.5);
		sem1_s1.addGrade("P3 (Programowanie)", 5.0); sem1_s1.addGrade("P3 (Programowanie)", 4.5); sem1_s1.addGrade("P3 (Programowanie)", 5.0);

		s1.addSemester(sem1_s1);

		// Student 2
		Student s2 = new Student("Anna", "Nowak", "Politechnika", "Informatyka", "654321");
		List<String> subjectsS2 = List.of("P1 (Matematyka)", "P2 (Fizyka)", "P3 (Programowanie)");
		Semester sem1_s2 = new Semester(1, subjectsS2);

		sem1_s2.addGrade("P1 (Matematyka)", 5.0); sem1_s2.addGrade("P1 (Matematyka)", 5.0);
		sem1_s2.addGrade("P2 (Fizyka)", 4.5);
		sem1_s2.addGrade("P3 (Programowanie)", 4.0); sem1_s2.addGrade("P3 (Programowanie)", 4.0);

		s2.addSemester(sem1_s2);

		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);

		// 2. Generowanie raportów
		System.out.println("--- Generowanie raportu TEKSTOWEGO (Semestr 1) ---");
		ReportGenerator txtGen = new PlainTextReportGenerator();
		String txtReport = txtGen.generateReport(studentList, 1);
		System.out.println(txtReport);

		System.out.println("\n\n--- Generowanie raportu HTML (Semestr 1) ---");
		ReportGenerator htmlGen = new HTMLReportGenerator();
		String htmlReport = htmlGen.generateReport(studentList, 1);
		System.out.println(htmlReport);
	}
}

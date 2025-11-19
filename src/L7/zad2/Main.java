package L7.zad2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/*
	 * List of Students
	 *  -> Each student has list of Semesters
	 *   -> Each Semester has list of Subjects
	 * 	   -> Each Subject has list of grades
	 */

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();

		// Generate 10 students
		for (int i = 1; i <= 10; i++) {
			Student student = new Student(
				"Name" + i,
				"Surname" + i,
				"University" + ((i % 3) + 1),
				"Field" + ((i % 3) + 1),
				1000 + i
			);

			studentList.add(student);
		}


		// For test 3 fields
		List<Semester> semestersOfField = new ArrayList<>();
		for (int i = 0; i < 3; i ++) {
			Semester semester = new Semester(i + 1, new ArrayList<>());
			semestersOfField.add(semester);
		}


		// Print student data
		for (Student student : studentList) {
			System.out.println("Student ID: " + student.getId() +
					", Name: " + student.getName() +
					", Surname: " + student.getSurname() +
					", University: " + student.getUniversity() +
					", Field: " + student.getField()
			);
		}
	}
}

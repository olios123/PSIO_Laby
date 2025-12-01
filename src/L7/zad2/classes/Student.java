package L7.zad2.classes;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private String surname;
	private String university;
	private String field;
	private String id;
	private List<Semester> semesters;

	public Student(String name, String surname, String university, String field, String id) {
		this.name = name;
		this.surname = surname;
		this.university = university;
		this.field = field;
		this.id = id;
		this.semesters = new ArrayList<>();
	}

	public void addSemester(Semester semester) {
		this.semesters.add(semester);
	}

	public Semester getSemester(int semesterNr) {
		for (Semester s : semesters) {
			if (s.getSemesterNr() == semesterNr) {
				return s;
			}
		}
		return null;
	}

	public String getName() { return name; }
	public String getSurname() { return surname; }
	public String getUniversity() { return university; }
	public String getField() { return field; }
	public String getId() { return id; }
}
package L7.zad2.classes;

import java.util.List;

public class Semester {
	private int semesterNr;
	private List<Subject> subjects;

	public Semester(int semesterNr, List<Subject> subjects) {
		if (semesterNr < 1 || semesterNr > 7) {
			throw new IllegalArgumentException("Number of semester must be between 1 and 7.");
		}
		this.semesterNr = semesterNr;
		this.subjects = subjects;
	}

	public void addGrade(String subjectName, double grade) {
		for (Subject p : subjects) {
			if (p.getName().equals(subjectName)) {
				p.addGrade(grade);
				return;
			}
		}
		throw new IllegalArgumentException("Subject not found in this semester.");
	}

	public int getSemesterNr() {
		return semesterNr;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
}
package L7.zad2;

import java.util.List;

public class Student {
	private String name;
	private String surname;
	private String university;
	private String field;
	private int id;

	private int currentSemester;
	private List<Semester> semestersList;

	/**
	 * Constructor
	 * @param name student name
	 * @param surname student surname
	 * @param university student university
	 * @param field student field of study
	 * @param id student id number
	 */
	public Student(String name, String surname, String university, String field, int id) {
		this.name = name;
		this.surname = surname;
		this.university = university;
		this.field = field;
		this.id = id;
	}

	/*
	 * Getters
	 */
	/**
	 * Get current semester
	 * @return current semester
	 */
	public Semester getCurrentSemester() {
		for (Semester semester : semestersList) {
			if (semester.getSemesterNr() == currentSemester) {
				return semester;
			}
		}
		return null;
	}
	public String getName() { return name; }
	public String getSurname() { return surname; }
	public String getUniversity() { return university; }
	public String getField() { return field; }
	public int getId() { return id; }
	public List<Semester> getSemestersList() { return semestersList; }

	/*
	 * Setters
	 */
	/**
	 * Set current semester
	 * @param currentSemester current semester
	 */
	public void setStudentSemester(int currentSemester) {
		if (currentSemester < 1 || currentSemester > 7) {
			throw new IllegalArgumentException("Semester number must be between 1 and 7.");
		}

		this.currentSemester = currentSemester;
	}
	/**
	 * Set semesters list
	 * @param semestersList list of semesters
	 */
	public void setSemestersList(List<Semester> semestersList) {
		this.semestersList = semestersList;
	}
}

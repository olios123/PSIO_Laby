package L7.zad2;

import java.util.Arrays;
import java.util.List;

public class Subject {
	// Subject code in format "P1", "P2", ...
	private String code;
	// List of grades for the subject
	// each grade is an integer from 2 to 5
	// requirements: at least 3 grades, at most 5 grades
	private List<Integer> grades;

	/**
	 * Constructor
	 * @param code subject code
	 */
	public Subject(String code) {
		// Check if correct code
		checkIfCorrectCode(code);

		this.code = code;
	}
	/**
	 * Constructor
	 * @param code subject code
	 * @param grades list of grades
	 */
	public Subject(String code, List<Integer> grades) {
		// Check if correct code
		checkIfCorrectCode(code);

		// Check if grades are in correct range
		for (Integer grade : grades) {
			if (grade < 2 || grade > 5) {
				throw new IllegalArgumentException("Grade " + grade + " is out of range [2-5].");
			}
		}

		this.code = code;
		this.grades = grades;
	}

	/*
	 * Inside functions
	 */
	/**
	 * Check if subject code is correct
	 * @param code subject code
	 */
	private void checkIfCorrectCode(String code) {
		if (code.split("")[0] != "P") {
			throw new IllegalArgumentException("Subject code must start with 'P'.");
		}
	}
	/**
	 * Check if grade is in correct range
	 * @param grade grade to check
	 * @return true if grade is in range, false otherwise
	 */
	private boolean checkIfCorrectGrade(int grade) {
		if (grade < 2 || grade > 5) {
			System.out.println("Grade " + grade + " is out of range [2-5].");
			return false;
		}
		return true;
	}

	/*
	 * Getters
	 */
	/**
	 * Get subject code
	 * @return subject code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * Get grades for the subject
	 * @return list of grades
	 */
	public List<Integer> getGrades() {
		return grades;
	}

	/*
	 * Setters
	 */
	/**
	 * Add grade to the subject
	 * @param grade grade to add
	 */
	public void addGrade(int grade) {
		// Check if grade is in correct range
		if (!checkIfCorrectGrade(grade)) return;

		this.grades.add(grade);
	}
	/**
	 * Set grades for the subject
	 * @param grades list of grades
	 */
	public void setGrades(List<Integer> grades) {
		for (int grade : grades) {
			// Check if grade is in correct range
			if (!checkIfCorrectGrade(grade)) return;
		}

		this.grades = grades;
	}

	/*
	 * Displaying functions
	 */
	/**
	 * Display subject information
	 */
	public void displaySubjectInfo() {
		System.out.println("Subject code: " + code);
		System.out.println("Grades: " + Arrays.toString(grades.toArray()));
	}
}

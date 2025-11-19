package L7.zad2;

import java.util.List;

public class Semester {
	// Semester number from 1 to 7
	private int semesterNr;

	// List of subjects in the semester
	// from 3 to 5 subjects
	// e.g. "P1", "P2", "P3" ...
	private List<Subject> subjectsList;

	/**
	 * Constructor
	 * @param semesterNr semester number
	 * @param subjectsList list of subjects
	 */
	public Semester(int semesterNr, List<Subject> subjectsList) {
		// Checking semester number [1 - 7]
		if (semesterNr < 1 || semesterNr > 7) {
			throw new IllegalArgumentException("Semester number must be between 1 and 7.");
		}

		// Checking number of subjects
		if (subjectsList.size() < 3 || subjectsList.size() > 5) {
			throw new IllegalArgumentException("Number of subjects must be between 3 and 5.");
		}

		// Checking if subjects elements in correct format
		for (Subject subject : subjectsList) {
			// Subject cannot be null
			if (subject == null) {
				throw new IllegalArgumentException("Subject cannot be null.");
			}

			// Each subject must start with "P"
			if (!subject.getCode().split("")[0].equals("P")) {
				throw new IllegalArgumentException("Subject " + subject + " is not in correct format.");
			}
		}

		this.semesterNr = semesterNr;
		this.subjectsList = subjectsList;
	}

	/*
	 * Getters
	 */
	/**
	 * Get semester number
	 * @return semester number
	 */
	public int getSemesterNr() {
		return semesterNr;
	}
	/**
	 * Get subjects list
	 * @return list of subjects
	 */
	public List<Subject> getSubjectsList() {
		return subjectsList;
	}
}

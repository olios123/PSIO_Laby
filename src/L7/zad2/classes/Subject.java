package L7.zad2.classes;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private String name;
	private List<Double> grades = new ArrayList<>();

	public Subject(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public List<Double> getGrade() {
		return grades;
	}

	public void addGrade(double grade) {
		this.grades.add(grade);
	}

}

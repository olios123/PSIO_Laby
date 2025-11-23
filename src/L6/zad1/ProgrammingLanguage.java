package L6.zad1;

public abstract class ProgrammingLanguage {
	private String name;

	public ProgrammingLanguage(String name) {
		this.name = name;
	}

	public abstract String getParadigm();
	public abstract String compileOrInterpret();
	public String toString() {
		return "name: " + name + " | paradigm: " + getParadigm() + " | compileOrInterpret: " + compileOrInterpret();
	}

	public String getName() {
		return name;
	}
}
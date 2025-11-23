package L6.zad1.languages;

import L6.zad1.ProgrammingLanguage;

public class PythonLanguage extends ProgrammingLanguage {
	public PythonLanguage() {
		super("python");
	}

	@Override
	public String getParadigm() {
		return "funkcyjny";
	}

	@Override
	public String compileOrInterpret() {
		return "interpretowany";
	}
}

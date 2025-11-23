package L6.zad1.languages;

import L6.zad1.ProgrammingLanguage;

public class JavaLanguage extends ProgrammingLanguage {

	public JavaLanguage() {
		super("java");
	}

	@Override
	public String getParadigm() {
		return "obiektowy";
	}

	@Override
	public String compileOrInterpret() {
		return "kompilowany";
	}
}

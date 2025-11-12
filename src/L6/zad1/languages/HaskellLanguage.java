package L6.zad1.languages;

import L6.zad1.ProgrammingLanguage;

public class HaskellLanguage extends ProgrammingLanguage {
	public HaskellLanguage() {
		super("haskell");
	}

	@Override
	public String getParadigm() {
		return "proceduralny";
	}

	@Override
	public String compileOrInterpret() {
		return "hybrydowy";
	}
}

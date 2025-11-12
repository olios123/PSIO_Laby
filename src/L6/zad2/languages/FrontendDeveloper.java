package L6.zad2.languages;

import L6.zad2.Programmer;

public class FrontendDeveloper extends Programmer {

	public FrontendDeveloper() {
		super("frontend");
	}

	@Override
	public String writeCode() {
		return "websites";
	}

	@Override
	public String favouriteLanguage() {
		return "typescript";
	}
}
